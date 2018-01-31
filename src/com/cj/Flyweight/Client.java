package com.cj.Flyweight;

public class Client {

	public static void main(String[] args) {
		//1
//		int extrinsicstate = 22;
//		FlyweightFactory f = new FlyweightFactory();
//		Flyweight fx = f.getFlyweight("X");
//		fx.operation(--extrinsicstate);
//		Flyweight fy = f.getFlyweight("Y");
//		fx.operation(--extrinsicstate);
//		Flyweight fz = f.getFlyweight("Z");
//		fx.operation(--extrinsicstate);
//		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
//		uf.operation(--extrinsicstate);
		//2
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use(new User("小菜"));
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use(new User("cj"));
		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.use(new User("gxp"));
		WebSite fl = f.getWebSiteCategory("博客");
		fl.use(new User("zz"));
		WebSite fm = f.getWebSiteCategory("博客");
		fm.use(new User("yy"));
		WebSite fn = f.getWebSiteCategory("博客");
		fn.use(new User("xx"));
		System.out.println("网站分类总数为" + f.getWebSiteCount());
		
	}

}
