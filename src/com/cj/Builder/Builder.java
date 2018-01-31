package com.cj.Builder;

/**
 * 2017年12月18日上午9:03:16
 * @author jcao Administrator
 * TODO 抽象建造者类。确定产品两个部件partA partB组成，并声明一个得到产品建造后结果的方法getResult
 */
abstract class Builder {
	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract Product getResult();
}
