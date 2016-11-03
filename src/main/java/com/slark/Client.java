package com.slark;

import java.io.*;
import java.net.*;
import java.util.Calendar;

public class Client {
	boolean isEnd = false;
	Socket socket;
	InputStream in;
	OutputStream out;
	BufferedReader line;

	public Client() {
		try {
			System.out.println("建立socket：\n");
			//socket = new Socket("127.0.0.1", 1234);
			socket = new Socket("127.0.0.1", 1234);
			System.out.println("连接服务器成功");
			in = socket.getInputStream();
			out = socket.getOutputStream();
			line = new BufferedReader(new InputStreamReader(
					System.in));
			
			System.out.println("go");
			char[] bufferC = new char[4049]; // 大小？？
			byte[] bufferB = new byte[4049]; // 大小？？
			int num = 4;
			while (isEnd == false) {
				// 发送
				// 最终采用的方案
				Calendar cal = Calendar.getInstance();
				int numQ = cal.get(Calendar.HOUR_OF_DAY) * 60 + cal.get(Calendar.MINUTE) - 1;// 本机比服务器时间蛮约50S，暂减1
				int numA = getLoginNum(numQ, 12345678);
				out.write(getNumBytes(8));
				out.write(getNumBytes(numQ));
				out.write(getNumBytes(numA));
				out.flush();

				if (line.ready()) {					
					num = line.read(bufferC);
					System.out.println("输入：" + num + "个字符");
					System.out.println("发送：");
					if(num == 2){
						sendStr("hello");
						System.out.println("发送：" + "hello");
					}
					else if(num == 3){
						sendStr("1234567824691356");
						System.out.println("发送：" + "1234567824691356");
					}else if(num == 4){

					}
					//out.write(bufferC, 0, num);
					//out.flush();
					num = 0;

				}
				// 接收
				if (in.available() > 0) {
					System.out.println("接收数据...");
					num = in.read(bufferB);
					System.out.println("收到：" + num + ":");
					for(int i = 0; i < num; i++){
						System.out.print(bufferB[i] & 0xff);
						System.out.print(":");
					}
					//System.out.println("收到：" + num + ":" + (new String(bufferB, 0, num)));
					//recvFile();
					num = 0;
					// break;
				}

				// if(0 == s.compareTo("*")) break;

			}
			
		} catch (IOException e) {
			System.out.println("wrong");
		} finally {
			System.out.println("结束");
			try {
				line.close();
				out.close();
				in.close();
				socket.close();// ??close是否应放后边
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

	private int getLoginNum(int aNonSslLoginQuestion, int aPasswd) { // 加密算法
		int q3 = (aNonSslLoginQuestion >>> 24) & 0xff;
		int q2 = (aNonSslLoginQuestion >>> 16) & 0xff;
		int q1 = (aNonSslLoginQuestion >>> 8) & 0xff;
		int q0 = aNonSslLoginQuestion & 0xff;
		int m00 = (q3 & 0x03) + 2;
		int m01 = (q2 + q3) % 31 + 1;
		int m10 = (q0 + q1) % 17 + 1;
		int m11 = (q1 & 0x03) + 2;
		int a = (q0 * m01 + q2 * m11) % 126 + 1;
		a = (a << 8) + ((q1 * m01 + q3 * m11) & 0xff);
		a = (a << 8) + ((q0 * m00 + q2 * m10) & 0xff);
		a = (a << 8) + ((q1 * m00 + q3 * m10) & 0xff);
		return a ^ aPasswd;
	}
	
	byte[] getNumBytes(int num) { // 数值转换为字节，低字节在前，高字节在后
		byte[] buffer = new byte[4];
		for (int i = 0; i < 4; i++) {
			buffer[i] = (byte) (num & 0xff);
			num = num >>> 8;
		}
		return buffer;
	}
	
	void sendStr(String str){
		System.out.println("发送：" + str);
		byte[] buffer = str.getBytes();
		try {
			out.write(getNumBytes(buffer.length));
			out.write(buffer);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

/*
	void recvFile() throws IOException {
		int fileSize = -1, fileStart = -1;
		System.out.println("接收文件");
		BufferedWriter fos = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("/home/administrator/456")));
		// 建立文件输出流，接收客户端传递的文件

		char[] buf = new char[4049];// 建立缓冲数组，接收文件时，将字节写入字节数组内部保存
		int readNum = 0;
		// 读长度，确定起始位置
		for (int size = 0; size != -1; size = in.read(buf, readNum, buf.length
				- readNum)) {
			// 取文件大小,设置起始位置(??优化)
			int sizeStart = -1;
			for (int j = 0; j < readNum + size; j++) {
				if (buf[j] == '#') {
					if (sizeStart < readNum)
						sizeStart = j;
					else {
						fileSize = char2Int(buf, sizeStart + 1, j - 1);
						fileStart = j + 1;
						break;
					}
				}
			}
			readNum += size;
			if (fileSize > 0)
				break;
		}
		System.out.println("文件长度" + fileSize + "起始位置" + fileStart);
		for (int size = 0; size != -1
				&& (readNum + size < fileStart + fileSize); size = in.read(buf,
				readNum, fileStart + fileSize - readNum)) {
			readNum += size;

		}
		fos.write(buf, fileStart, fileSize);
		fos.flush();// 强制写入文件
		fos.close();
	}

	boolean getFileSize() {// 判断是否取得文件头
		return false;
	}

	int char2Int(char[] buffer, int off, int len) { // ??编码问题
		if (off + len > buffer.length)
			return -1;
		int num = 0;
		for (int i = 0; i < len; i++) {
			System.out.println(buffer[off + i]);
			if (buffer[off + i] >= '0' && buffer[off + i] <= '9') {
				num = num * 10 + buffer[off + i] - '0';
			} else {
				return -1;
			}
		}
		return num;
	}*/

	public static void main(String[] args) {
		new Client();
	}
}