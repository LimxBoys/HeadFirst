package com.limx.zhuangshizhe1;
/**
 * 抽象组件
 * @author admin
 *
 */
public abstract class Beverage {
	String description ="Unknow Beverage";
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}
