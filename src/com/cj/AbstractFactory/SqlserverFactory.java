package com.cj.AbstractFactory;

/**
 * @author caojie
 * 实现IFactory接口，实例化SqlserverUser
 */
public class SqlserverFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}

}
