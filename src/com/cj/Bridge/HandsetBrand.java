package com.cj.Bridge;

public abstract class HandsetBrand {

	protected HandsetSoft soft;
	
	public abstract void Run();

	public HandsetSoft getSoft() {
		return soft;
	}

	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
	
}
