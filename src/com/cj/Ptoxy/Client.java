package com.cj.Ptoxy;

public class Client {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("cj");
//		Pursuit gxp = new Pursuit(girl);
		Proxy daili = new Proxy(girl);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}

