package com.cj.Observer;

public class Client {

	public static void main(String[] args) {
		//1
		Boss huhansan = new Boss();
		StockObserver tongshi1 = new StockObserver("cj1",huhansan);
		NBAObserver tongshi2 = new NBAObserver("cj2",huhansan);
		
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);
		huhansan.detach(tongshi1);
		huhansan.setAction("the boss back");
		huhansan.Notify();
	}

}
