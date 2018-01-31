package com.cj.Prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 1
//		ConcretePrototype1 p1 = new ConcretePrototype1("I");
//		ConcretePrototype1 c1 = (ConcretePrototype1) p1.Clone();
//		System.out.println("Cloned:" + c1.getId());
		// 2
		Resume a = new Resume("jcao");
		a.setPersonalInfo("女", "24");
		a.setWorkExprience("2016", "H3C");
		
		Resume b = (Resume) a.Clone();
		b.setWorkExprience("2017", "VR-KB");
		
		Resume c = (Resume) a.Clone();
		c.setPersonalInfo("男", "23");
		
		a.display();
		b.display();
		c.display();
	}

}
