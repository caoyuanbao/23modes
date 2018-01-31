package com.cj.Decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("cj");
		System.out.println("第一种装扮");
		Finery dtx = new TShirts();
		Finery kk = new BigTrousers();
		Finery pqx = new Sneakers();
		
//		xc.show();
//		dtx.show();
//		kk.show();
//		pqx.show();
		pqx.decorate(xc);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();
		
		System.out.println("第二种装扮");
		Finery xz= new Suit();
		Finery ld = new Tie();
		Finery px = new LeathersShoes();
		
//		xc.show();
//		xz.show();
//		ld.show();
//		px.show();
		px.decorate(xc);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
		//2
//		ConcreteComponent c = new ConcreteComponent();
//		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
//		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
//		
//		d1.setComponent(c);;
//		d2.setComponent(d1);
//		d2.operation();
	}

}
