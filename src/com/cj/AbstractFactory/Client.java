package com.cj.AbstractFactory;

public class Client {
	
	public static void main(String[] args) {
		// 1
//		User user = new User();
//		SqlserverUser su = new SqlserverUser();
//		su.insert(user);
//		su.getUser(1);
		// 2
//		User user = new User();
//		IFactory factory = new SqlserverFactory();
//		IUser iu = factory.createUser();
//		iu.insert(user);
//		iu.getUser(1);
		// 3
		User user = new User();
		Department dept = new Department();
		IFactory factory = new SqlserverFactory();
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
		IDepartment id = factory.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
	}
}
