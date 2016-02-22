package com.limx.zhuangshizhe1;

public class MyTest {
	public static void main(String[] args) {
		/*Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());*/
		Beverage beverage2=new HouseBlend();
		Beverage beverage3=new Mocha(beverage2);
		Beverage beverage4=new Mocha(beverage3);
		System.out.println(beverage4.getDescription()+"$"+beverage2.cost());
	}
}
