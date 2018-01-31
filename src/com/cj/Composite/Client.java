package com.cj.Composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Composite root = new Composite("root");
//		root.add(new Leaf("Leaf A"));
//		root.add(new Leaf("Leaf B"));
//		
//		Composite comp = new Composite("Composite X");
//		comp.add(new Leaf("Leaf XA"));
//		comp.add(new Leaf("Leaf XB"));
//		
//		root.add(comp);
//		
//		Composite comp2 = new Composite("Composite XY");
//		comp2.add(new Leaf("Leaf XYA"));
//		comp2.add(new Leaf("Leaf XYB"));
//		
//		comp.add(comp2);
//		
//		root.add(new Leaf("Leaf C"));
//		
//		Leaf leaf = new Leaf("Leaf D");
//		root.add(leaf);
//		root.remove(leaf);
//		
//		root.display(1);
		
		// ======================================
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany comp1 = new ConcreteCompany("1分公司");
		comp1.add(new HRDepartment("1分公司人力资源部"));
		comp1.add(new FinanceDepartment("1分公司财务部"));
		root.add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("2分公司");
		comp2.add(new HRDepartment("2分公司人力资源部"));
		comp2.add(new FinanceDepartment("2分公司财务部"));
		root.add(comp2);
		
		ConcreteCompany comp3 = new ConcreteCompany("3分公司");
		comp3.add(new HRDepartment("3分公司人力资源部"));
		comp3.add(new FinanceDepartment("3分公司财务部"));
		root.add(comp3);
		
		System.out.println("结构图=========");
		root.display(1);
		
		System.out.println("职责=============");
		root.lineOfDuty();
	}

}
