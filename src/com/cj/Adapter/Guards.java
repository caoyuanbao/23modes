package com.cj.Adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("后卫" + name + "进攻");

	}

	@Override
	public void defense() {
		System.out.println("后卫" + name + "防守");

	}

}
