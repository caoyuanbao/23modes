package com.cj.FactoryMethod;

public class Client {

	public static void main(String[] args) {
		// 1
//		LeiFeng xueleifeng = new Undergraduate();
//		xueleifeng.buyRice();
//		xueleifeng.sweep();
//		xueleifeng.wash();
		// 2
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		student.buyRice();
		student.sweep();
		student.wash();
	}

}
