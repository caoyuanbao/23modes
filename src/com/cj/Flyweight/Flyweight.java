package com.cj.Flyweight;

/**
 * 2017年12月25日上午11:41:38
 * @author jcao Administrator
 * TODO 所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 */
public abstract class Flyweight {
	public abstract void operation(int extrinsicstate);
}
