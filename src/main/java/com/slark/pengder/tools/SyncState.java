package com.slark.pengder.tools;

import java.util.Date;

public class SyncState {
	private EUpdateType type;
	private EState state;
	private Date lastTime;
	
	public SyncState() {
		// TODO Auto-generated constructor stub
		this.type = null;
		this.state = EState.None;
		this.lastTime = new Date();
	}
	
	public SyncState(EUpdateType type){
		this.type = type;
		this.state = EState.None;
		this.lastTime = new Date();
	}

	public EUpdateType getType() {
		return type;
	}

	public void setType(EUpdateType type) {
		this.type = type;
	}

	public EState getState() {
		return state;
	}

	public boolean setState(EState state) {
		if(state == EState.Todo && (new Date().getTime() - lastTime.getTime())/1000 >= 60){
			//如果已标记待同步 或者 正在同步
			if(this.state == EState.Todo || this.state == EState.Doing)
				return false;
		}
		/**
		 * 状态变更，线程安全
		 */
		synchronized (state) {
			this.state = state;
			setLastTime(new Date());
		}
		return true;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
}
