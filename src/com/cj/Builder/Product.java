package com.cj.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caojie
 * 产品类，由多个部件组成
 */
public class Product {

	List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("产品创建-------");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
