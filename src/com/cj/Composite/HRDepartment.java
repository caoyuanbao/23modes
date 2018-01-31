package com.cj.Composite;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(depth + "-" + getName());
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"员工招聘培训管理");
	}

}
