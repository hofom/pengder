package com.slark.pengder.test;

import com.slark.util.system.ResourcePath;

import javax.net.ssl.*;
import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.KeyStore;

//import javax.net.ssl.KeyManagerFactory;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.SSLServerSocket;
//import javax.net.ssl.SSLServerSocketFactory;
//import javax.net.ssl.TrustManager;


//当前目录
class MyCurrentPath {
    static String path = "";///home/zao/workspace/
}

/*
 * SSL实例双向认证(阻塞型)-client
 */
public class SSLClient {
    static SSLSocket s;

    static int instrumentID = PropertyManager.getInt("InstrumentID", 65601);
    static String MacAddr = PropertyManager.getProtery("MacAddr", "00:15:58:c6:ff:ce");

    static boolean isInited = false;

    private static RecvByteBuffer recvByteBuffer = new RecvByteBuffer(); // 接收字节缓存

    public SSLClient() {
    }


    public static void main(String args[]) {
        //PropertyManager.setProtery("InstrumentID", "65550");
        //PropertyManager.setProtery("InstrumentID", "osla!@#$%^");
        //try {
        //	System.out.println(URLEncoder.encode("jdbc:mysql://211.86.157.104:3306/oslabeta2?user=osla&password=osl", "UTF-8"));
        //} catch (UnsupportedEncodingException e1) {
        // TODO Auto-generated catch block
        //	e1.printStackTrace();
        //}

        try {
            if (args.length > 0) {
                int num = Integer.parseInt(args[0]);
                if (num >= 65536) {
                    Log.println("输入参数有效" + num);
                    instrumentID = num;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Log.println(e.getMessage());
        }

        Log.println("模拟客户端启动");
        if (true == "true".equals(PropertyManager.getProtery("IsInited", "true"))) {
            SSLClient.isInited = true;
        } else {
            SSLClient.isInited = false;
        }
        Log.println("instrumentID：" + SSLClient.instrumentID);
        Log.println("MacAddr：" + SSLClient.MacAddr);
        Log.println("是否已初始化：" + SSLClient.isInited);

        final long ReconnectTime = 1000 * (long) PropertyManager.getInt("ReconnectTime", 1800);
        Log.println("断线重连间隔时间(ms)：" + ReconnectTime);

        while (true) {


            boolean isEnd = false;
            Socket socket = null;
            try {
                //debug
            /*int instrumentID = Integer.parseInt(PropertyManager.getProtery("InstrumentID", ""));
            System.out.println("InstrumentID:" + instrumentID);
			instrumentID = instrumentID + 1;
			PropertyManager.setProtery("InstrumentID", Integer.toString(instrumentID));
			System.out.println("InstrumentID:" + PropertyManager.getProtery("InstrumentID", ""));
			*/

                Log.println("建立ssl-socket：");
                socket = getSocket(PropertyManager.getProtery("CommServerIP", "127.0.0.1"), Integer.parseInt(PropertyManager.getProtery("CommServerPort", "6666")));
                Log.println("连接服务器成功");
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                BufferedReader line = new BufferedReader(new InputStreamReader(
                        System.in));

                socket.setSoTimeout(78);// 设置超时时间（在此用于read）

                final long HeartBeatTime = 1000 * (long) PropertyManager.getInt("HeartBeatTime", 1);
                long nextHeartBeatTime = 0;

                byte[] buffer = null;
                if (false == isInited) {
                    buffer = DataInstrumentBinding.getInstance(false).encodeToByteArray();
                    //buffer =DataCommandSend.getInitReq().encodeToByteArray();
                    out.write(buffer);
                    out.flush();
                } else {
                    buffer = DataHeartBeatSend.getInstance().encodeToByteArray();
                    out.write(buffer);
                    out.flush();

                    //buffer = DataSystemEventList.getInstance().encodeToByteArray();
                    //out.write(buffer);
                    //out.flush();
                }

                // debug
                int maxHeartBeatTime = 0;
                int sendNum = 1;
                DataRecv dataNode = null;
                DataSend newDataSend = null;

                Log.println("循环启动");
                while (isEnd == false) {
                    //Thread.sleep(100);

                    try {
                        if (recvByteBuffer.getFreeSize() > 0) {
                            int readNum = in
                                    .read(recvByteBuffer.buffer, recvByteBuffer.bufferTail,
                                            recvByteBuffer.getFreeSize());

                            if (readNum > 0) {
                                recvByteBuffer.bufferTail += readNum;
                                readNum = 0;

                            }
                        } else {
                            Log.println("iorecv" + "warn" + "接收缓存满"); // debug
                        }
                    } catch (SocketTimeoutException e) {
                        // System.out.println("等待数据超时");
                        // Log.println(e.getMessage());
                    } catch (IOException e) {
                        System.out.println("io出错");
                        Log.println(e.getMessage());
                        break;
                    }

                    // 解析并处理消息（前边收到到数据有限，这里到while不是死循环）
                    dataNode = recvByteBuffer.check(); // 包解析
                    while (dataNode != null) {
                        // 消息响应
                        int dataId = dataNode.getDataID();
                        System.out.println("收到包" + dataId + ":" + dataNode.toString());
                        if (DataHeartBeatRecv.dataID != dataId)
                            Log.println("收到包" + dataId + ":" + dataNode.toString());

                        if (dataId == DataHeartBeatRecv.dataID) {// 心跳包（也要上传）
                            //Log.println("收到心跳包"); // debug
                            DataHeartBeatRecv newdata = (DataHeartBeatRecv) dataNode;
                            int timeSub = newdata.getServerTimeStamp() - newdata.getClientTimeStamp();
                            if (timeSub > maxHeartBeatTime) maxHeartBeatTime = timeSub;
                            // "client:" + newdata.getClientTimeStamp() + " server:" + newdata.getServerTimeStamp()
                            Log.println("心跳包：" + " timeSub:" + timeSub + " maxHeartBeatTime:" + maxHeartBeatTime);
                            newDataSend = null;
                        } else if (dataId == DataCommandRecv.dataID) { // 通用消息包
                            newDataSend = null;
                            //log.print("iorecv", Log.debug, "收到通用消息包" + dataId);
                            DataCommandRecv dataRecvCommand = (DataCommandRecv) dataNode; // ??强制转换是否会有安全问题
                            if (dataRecvCommand.isReplyOK()) {// 回复包???加入发送包
                                Log.println("收到OK");

                            } else if (dataRecvCommand.isReplyERR()) {
                                Log.println("收到ERR");
                            } else if (dataRecvCommand.isReplyInitedDone()) {
                                Log.println("收到InitedDone");
                                newDataSend = DataCommandSend.getReplyOK();
                                if (null != newDataSend) {
                                    buffer = newDataSend.encodeToByteArray();
                                    out.write(buffer);
                                    out.flush();
                                    newDataSend = null;
                                }
                                // 绑定
                                newDataSend = DataInstrumentBinding.getInstance(true);

                            }

                        } else {
                            //if(DataAccountList.dataID != dataNode.getDataID()){
                            Log.println("回复OK" + dataNode);
                            Log.println("dataId :" + dataNode.getDataID() + "--value : " + dataNode.toString());
                            newDataSend = DataCommandSend.getReplyOK();
                            //}

                        }

                        if (null != newDataSend) {
                            buffer = newDataSend.encodeToByteArray();
                            out.write(buffer);
                            out.flush();
                            newDataSend = null;
                        }

                        dataNode = recvByteBuffer.check(); // 继续包解析
                    }
                    dataNode = null;
                    recvByteBuffer.clean(); // 数据压缩（把后边读数据移到起始处）

                    // 发送心跳包
                    final long currentTime = System.currentTimeMillis();
                    if (true == isInited && currentTime > nextHeartBeatTime) {
                        nextHeartBeatTime = currentTime + HeartBeatTime;
                        buffer = DataHeartBeatSend.getInstance().encodeToByteArray();
                        //if((sendNum--) > 0){
                        out.write(buffer);
                        out.flush();
                        //}

                        //buffer = DataClientSessionList.getInstance().encodeToByteArray();
                        //out.write(buffer);
                        //out.flush();
                        /*
                        if (sendNum > 0) {
                            buffer = DataUserInTrainingList.getInstance().encodeToByteArray();
                            //DataSystemEventList.getInstance().encodeToByteArray();
                            out.write(buffer);
                            out.flush();

                            sendNum--;
                        }
						*/
						
					/*	buffer = DataClientSessionList.getInstance().encodeToByteArray();
						out.write(buffer);
						out.flush();*/
                    }
				
				/*while((sendNum--) > 0){
					System.out.println("send" + sendNum);
					buffer = DataClientSessionList.getInstance().encodeToByteArray();
					out.write(buffer);
					out.flush();
				}
				sendNum = 100;*/

                    //System.out.println("发送请求--");


                }
                System.out.println("结束");
                line.close();
                out.close();
                in.close();
                socket.close();// ??close是否应放后边
            } catch (Exception e) {
                e.printStackTrace();
                Log.println(e.getMessage());
            }
            Log.println("客户端线程终止，" + ReconnectTime / 1000 + "秒后重启");
            try {
                Thread.sleep(ReconnectTime);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Log.println("客户端线程重启");

        }
    }


    // connct SSLSocket
    private static SSLSocket getSocket(String theHost, int thePort) throws Exception {
        SSLSocket s = null;

        // String key = "SSLKey"; "/home/administrator/kclient.keystore";
        ResourcePath.getSlarkConfigureFile("config/kclient.keystore");
        String key1 = ResourcePath.getSlarkConfigureFile("config/kclient.keystore");//MyCurrentPath.path + "kclient.keystore"; // 要使用的证书名
        String key2 = ResourcePath.getSlarkConfigureFile("config/tclient.keystore");//MyCurrentPath.path + "tclient.keystore";

        char keyStorePass[] = "123456".toCharArray(); // 证书密码

        char keyPassword[] = "123456".toCharArray(); // 证书别称所使用的主要密码

        KeyStore ks = KeyStore.getInstance("JKS");
        KeyStore tks = KeyStore.getInstance("JKS"); // 创建JKS密钥库

        ks.load(new FileInputStream(key1), keyStorePass);
        tks.load(new FileInputStream(key2), keyStorePass);

        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        TrustManagerFactory tmf = TrustManagerFactory
                .getInstance("SunX509");

        kmf.init(ks, keyPassword);
        tmf.init(tks);

        // 构造SSL环境，指定SSL版本为3.0，也可以使用TLSv1，但是SSLv3更加常用。
        SSLContext sslContext = SSLContext.getInstance("SSLv3");

			/*
			 * 初始化SSL环境。第二个参数是告诉JSSE使用的可信任证书的来源，
			 * 设置为null是从javax.net.ssl.trustStore中获得证书。
			 * 第三个参数是JSSE生成的随机数，这个参数将影响系统的安全性， 设置为null是个好选择，可以保证JSSE的安全性。
			 */
        TrustManager[] tm = {new MyX509TrustManager()};
        sslContext.init(kmf.getKeyManagers(), tm, null);
        // sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(),
        // null);

        // 根据上面配置的SSL上下文来产生SSLServerSocketFactory,与通常的产生方法不同
        SSLSocketFactory factory = sslContext.getSocketFactory();

        s = (SSLSocket) factory.createSocket(theHost, thePort);
        // s.setNeedClientAuth(false);//此设置没什么用，客户端必须验证服务端证书
        s.startHandshake();


        return (s);
    }
}


// 客户端没有超时退出功能？？


