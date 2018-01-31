package com.cj.Composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(depth + "-" + getName());
	}

}
