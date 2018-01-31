package com.cj.Prototype;

public abstract class Prototype {

	private String id;

	public Prototype(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public abstract Prototype Clone() throws CloneNotSupportedException;
}
