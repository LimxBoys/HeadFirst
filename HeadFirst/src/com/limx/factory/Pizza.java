package com.limx.factory;
import java.util.ArrayList;
/**
 * 抽象比萨类
 * @author limingxing
 * @Date:2016-2-22下午5:50:31
 * @email:limingxing_aqgy@sina.com
 * @version:1.0
 */
public abstract class Pizza {
	String name;//名称
	String dough;//面团类型
	String sauce;//浆料类型
	ArrayList toppings=new ArrayList();//一套佐料
	void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i=0;i<toppings.size();i++){
			System.out.println("   "+toppings.get(i));
		}
	}
	void bake(){
		System.out.println("Bake for 25 mnutes at 350");
	}
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	public String getName(){
		return name;
	}
}
