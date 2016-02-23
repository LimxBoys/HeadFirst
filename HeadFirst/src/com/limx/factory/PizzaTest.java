package com.limx.factory;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore nystore=new NYStylePizzaStore();
		PizzaStore chicagoStore=new ChicagoStylePizzaStore();
		Pizza pizza=nystore.orderPIzza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
		pizza=chicagoStore.orderPIzza("cheese");
		System.out.println("Joel ordered a "+pizza.getName()+"\n");
	}
}
