package com.cj.Decorator;

public class ConcreteDecoratorA extends Decorator {

	private String addedState;
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作");
	}
}
