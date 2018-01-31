package com.cj.Bridge;

public class Client {

	public static void main(String[] args) {
		HandsetBrand ab;
		ab = new HandsetBrandN();
		
		ab.setSoft(new HandsetGame());
		ab.Run();
		
		ab.setSoft(new HandsetAddressList());
		ab.Run();
		
		ab = new HandsetBrandM();
		
		ab.setSoft(new HandsetGame());
		ab.Run();
		
		ab.setSoft(new HandsetAddressList());
		ab.Run();
	}

}
