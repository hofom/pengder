package com.slark.pengder.tools;

public enum EState {
	None(0, 0), Todo(1, 1), Doing(2, 2), Succ(3, 3), Failed(4, 4);

	final private int index;
	final private int value; // 类型ID

	private EState(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public static Integer maxIndex(){
		return EState.Failed.index + 1;
	}
	
	/**
	 * 将枚举数值转化为枚举类型
	 * @param value
	 * @return
	 */
	public static EState valueOf(int value) {
		switch (value) {
		case 0:
			return EState.None;
		case 1:
			return EState.Todo;
		case 2:
			return EState.Doing;
		case 3:
			return EState.Succ;
		case 4:
			return EState.Failed;
		default:
			return null;
		}
	}
	
	/**
	 * 将枚举序列转化为枚举类型
	 * @param index
	 * @return
	 */
	public static EState indexOf(int index) {
		switch (index) {
		case 0:
			return EState.None;
		case 1:
			return EState.Todo;
		case 2:
			return EState.Doing;
		case 3:
			return EState.Succ;
		case 4:
			return EState.Failed;
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
	 * 获取序列值
	 * @return
	 */
	public int getIndex() {
		return this.index;
	}
	
}
