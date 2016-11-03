package com.slark.pengder.ws;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface WebServer {
	/**
	 * 查询刷卡机网络状态
	 * 返回数组，类型int，值为1表示刷卡机节点在线，为0表示刷卡机不在线，数组长度不一定覆盖所有刷卡机（后边没有表示到均为不在线）
	 * @return 刷卡及状态数组（数组下标为刷卡机ID对65536取余的结果）
	 */ 
	public Integer[] getInstrumentStateList();

	/**
	 * 通知更新
	 * 更新类型枚举数值：311：用户 312：账户 313：资格 314：临时卡 315：仪器 316：专享时间 317：预约 318：系统日历表 319：全局配置
	 * @param aType : 更新类型（枚举数值）
	 * @param aID1  : 与仪器相关时为仪器ID，其他情况为保留参数
	 * @param aID2  : 保留参数
	 */
	public void setNewUpdateReq(int aType, int aID1, int aID2);

	/**
	 * @description
	 * 		远程操作设备下机
	 * @param id  t_remote_shutdown_record.id
     * @return
	 *     返回Success 表明设备下机命令已经下发
	 *     返回其他的字符串，描述的是错误原因
     */
	public String instrumentDeplane(int id);

}
