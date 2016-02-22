package com.limx.zhuangshizhe1;
/**
 * 具体组件
 * @author admin
 *
 */
public class Espresso extends Beverage{
	public Espresso(){
		description="Espresso";
	}
	@Override
	public double cost() {
		return 1.99;
	}

}
