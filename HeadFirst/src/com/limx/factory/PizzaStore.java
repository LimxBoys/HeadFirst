package com.limx.factory;
/**
 * 抽象比萨店
 * @author limingxing
 * @Date:2016-2-23上午10:45:19
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public abstract class PizzaStore {
	public Pizza orderPIzza(String type) {
		Pizza pizza;
		pizza=cretePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza cretePizza(String type);
}
