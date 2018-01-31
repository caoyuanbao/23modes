package com.cj.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

	private static Singleton instance;
	
	// 构造方法让其private，这就堵死了外界利用new创建此类实例的可能
	private Singleton(){
		
	}
	//此方法是获得本类实例的唯一全局访问点
//	public static Singleton getInstance(){
//		if(instance == null){//若实例不存在则new一个新的
//			instance = new Singleton();
//		}
//		return instance;//否则返回已有实例
//	}
	
	// 2 多线程时的单例
	// 程序运行时创建一个静态只读的进程辅助对象
//	private static final Object syncRoot = new Object();
//	
//	public static Singleton getInstance(){
//		Lock lock = new ReentrantLock(); 
//		lock.lock();
//		try {
//			if(instance == null){//若实例不存在则new一个新的
//				instance = new Singleton();
//			}
//		} finally {
//			lock.unlock();
//		}
//		return instance;//否则返回已有实例
//	}
	
	// 双重锁定 Double-Check Locking
	public static Singleton getInstance(){
		
		if(instance == null){//若实例不存在则new一个新的
			Lock lock = new ReentrantLock(); 
			lock.lock();
			try {
				if(instance == null){//若实例不存在则new一个新的
					instance = new Singleton();
				}
			} finally {
				lock.unlock();
			}
		}
		return instance;//否则返回已有实例
	}
}
