package com.cj.Decorator;

public class ConcreteDecoratorB extends Decorator {

	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	public void addedBehavior(){
		
	}
}
