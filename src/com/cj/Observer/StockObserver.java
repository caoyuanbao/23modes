package com.cj.Observer;

public class StockObserver extends Observer{
	
	public StockObserver(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + name + "关闭股票行情，继续工作！");
	}



	
}
