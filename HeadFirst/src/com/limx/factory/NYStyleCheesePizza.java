package com.limx.factory;
/**
 * 具体纽约比萨子类
 * @author limingxing
 * @Date:2016-2-22下午5:49:18
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		name="NY Style sauce and Cheese Pizza";
		dough="Thin Crust Dough";
		sauce="Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
