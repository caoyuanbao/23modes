package com.cj.Flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable<String,Object> flyweights = new Hashtable<String,Object>();

	public FlyweightFactory() {
		super();
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return (Flyweight)flyweights.get(key);
	}

	
	
	
}
