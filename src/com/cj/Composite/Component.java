package com.cj.Composite;

public abstract class Component {

	private String name;

	public Component(String name) {
		super();
		this.setName(name);
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
