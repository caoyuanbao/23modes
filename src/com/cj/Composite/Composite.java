package com.cj.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(depth + "-" + getName());
		for (Component component : children) {
			component.display(depth + 2);
		}
	}

}
