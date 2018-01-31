package com.cj.Adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("中锋" + name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("中锋" + name + "防守");
	}

}
