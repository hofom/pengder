package com.slark.pengder.tools;

/**
 * 数据库中同步类型枚举类（*表与仪器无关）
 * 311：用户（*） 312：账户（*） 313：资格 314：临时卡 315：仪器 316：专享时间 317：预约 318：系统日历表（*） 319：全局配置（*）
 * @author HeHao
 *
 */
public enum EUpdateType {
	UserList(0, 311), AccountList(1, 312), UserRightList(2, 313), TempCardBindingList(
			3, 314), InstrumentDetail(4, 315), ReservationList(5, 316), BookingList(
			6, 317), CalendarList(7, 318), GlobalConfig(8, 319);

	final private int index;
	final private int value; // 类型ID

	private EUpdateType(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public static Integer maxIndex(){
		return EUpdateType.GlobalConfig.index + 1;
	}
	
	/**
	 * 将枚举数值转化为枚举类型
	 * @param value
	 * @return
	 */
	public static EUpdateType valueOf(int value) {
		switch (value) {
		case 311:
			return EUpdateType.UserList;
		case 312:
			return EUpdateType.AccountList;
		case 313:
			return EUpdateType.UserRightList;
		case 314:
			return EUpdateType.TempCardBindingList;
		case 315:
			return EUpdateType.InstrumentDetail;
		case 316:
			return EUpdateType.ReservationList;
		case 317:
			return EUpdateType.BookingList;
		case 318:
			return EUpdateType.CalendarList;
		case 319:
			return EUpdateType.GlobalConfig;
		default:
			return null;
		}
	}
	
	/**
	 * 将枚举序列转化为枚举类型
	 * @param index
	 * @return
	 */
	public static EUpdateType indexOf(int index) {
		switch (index) {
		case 0:
			return EUpdateType.UserList;
		case 1:
			return EUpdateType.AccountList;
		case 2:
			return EUpdateType.UserRightList;
		case 3:
			return EUpdateType.TempCardBindingList;
		case 4:
			return EUpdateType.InstrumentDetail;
		case 5:
			return EUpdateType.ReservationList;
		case 6:
			return EUpdateType.BookingList;
		case 7:
			return EUpdateType.CalendarList;
		case 8:
			return EUpdateType.GlobalConfig;
		default:
			return null;
		}
	}
	
	/**
	 * 获取枚举值
	 * @return
	 */
	public int getNumber() {
		return this.value;
	}
	
	/**
	 * 获取序列值，没意义，除非与消息命令字打通
	 * @return
	 */
	public int getIndex() {
		return this.index;
	}
	
}
