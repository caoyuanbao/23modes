package com.cj.AbstractFactory;

/**
 * @author caojie
 *用于访问access的department
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department Department) {
		System.out.println("在access中给user表增加一条记录");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在access中根据id得到Department表一条记录");
		return null;
	}

}
