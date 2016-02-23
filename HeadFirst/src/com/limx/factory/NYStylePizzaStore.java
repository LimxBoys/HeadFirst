package com.limx.factory;
/**
 * 具体纽约比萨店
 * @author limingxing
 * @Date:2016-2-23上午10:48:04
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public class NYStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza cretePizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleCheesePizza();
		}else if(type.equals("clam")){
			return new NYStyleCheesePizza();
		}else if(type.endsWith("pepperoni")){
			return new NYStyleCheesePizza();
		}else return null;
	}
	
}
