package com.cj.Ptoxy;

public class Proxy implements GiveGift{

	private Pursuit gg;
	
	public Proxy(SchoolGirl mm) {
		super();
		this.gg = new Pursuit(mm);
	}
	public void giveDolls(){
		gg.giveDolls();
	}
	public void giveFlowers(){
		gg.giveFlowers();
	}
	public void giveChocolate(){
		gg.giveChocolate();
	}
}
