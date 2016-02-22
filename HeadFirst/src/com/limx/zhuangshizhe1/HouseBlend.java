package com.limx.zhuangshizhe1;
/**
 * 具体组件
 * @author admin
 *
 */
public class HouseBlend extends Beverage{
	public HouseBlend() {
		description="House Blend coffee";
	}
	@Override
	public double cost() {
		return 0.89;
	}

}
