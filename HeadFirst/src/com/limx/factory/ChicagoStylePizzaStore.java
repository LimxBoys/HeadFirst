package com.limx.factory;
/**
 * 具体芝加哥比萨店
 * @author limingxing
 * @Date:2016-2-23上午10:48:38
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza cretePizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("pepperoni")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("clam")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}
	
}
