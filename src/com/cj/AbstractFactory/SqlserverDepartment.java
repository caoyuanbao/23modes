package com.cj.AbstractFactory;

public class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("在sqlserver中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在sqlserver中根据id得到Department表一条记录");
		return null;
	}

}
