package com.cj.Singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 ==s2){
			System.out.println("两个对象是相同的实例");
		}
	}

}
