package com.cj.AbstractFactory;

/**
 * @author caojie
 *定义一个创建（访问User表对象的抽象的）工厂接口
 */
public interface IFactory {
	IUser createUser();
	
	IDepartment createDepartment();
}
