package com.cj.Builder;

public class Director {

	public void Construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
