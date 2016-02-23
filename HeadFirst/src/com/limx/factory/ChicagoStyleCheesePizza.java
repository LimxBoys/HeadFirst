package com.limx.factory;
/**
 * 具体芝加哥比萨子类
 * @author limingxing
 * @Date:2016-2-23下午1:13:25
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name="Chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
