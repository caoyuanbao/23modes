package com.cj.Prototype;

public class ConcretePrototype1 extends Prototype implements Cloneable{

	public ConcretePrototype1(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prototype Clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Prototype) this.clone();
	}

}
