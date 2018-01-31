package com.cj.Decorator;

public class Finery extends Person{


	protected Person cpmponent;

	public void decorate(Person cpmponent){
		this.cpmponent = cpmponent;
	}
	
	@Override
	public void show(){
		if (cpmponent != null) {
			cpmponent.show();
		}
	}
}
