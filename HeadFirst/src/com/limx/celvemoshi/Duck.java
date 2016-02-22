package com.limx.celvemoshi;
/**
 * 环境对象
 * @author admin
 *
 */
public abstract class Duck {
	Fly fly;
	Quck quck;
	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public void setQuck(Quck quck) {
		this.quck = quck;
	}
	public void DcukFly(){
		fly.fly();
	}
	public void DuckQuck(){
		quck.quck();
	}
}
