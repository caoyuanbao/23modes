package com.cj.AbstractFactory;

/**
 * @author caojie
 * 实现IFactory接口，实例化AccessUser
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

}
