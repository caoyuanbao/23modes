package com.cj.AbstractFactory;

/**
 * @author caojie
 * 用于客户端访问，解除与具体数据库访问的耦合
 *
 */
public interface IUser {

	public void insert(User user);
	
	public User getUser(int id);
}
