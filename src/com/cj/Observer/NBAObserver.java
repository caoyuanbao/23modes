package com.cj.Observer;

public class NBAObserver extends Observer{
	
	public NBAObserver(String name, Boss sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + name + "关闭NBA直播，继续工作！");
	}



	
}
