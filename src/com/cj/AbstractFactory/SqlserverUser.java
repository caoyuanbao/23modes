package com.cj.AbstractFactory;

/**
 * @author caojie
 * 用于访问sqlserver的user
 *
 */
public class SqlserverUser implements IUser{
	
	public void insert(User user) {
		System.out.println("在sqlserver中给user表增加一条记录");
	}
	
	public User getUser(int id) {
		System.out.println("在sqlserver中根据id得到user表一条记录");
		return null;
	}

}
