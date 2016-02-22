package com.limx.zhuangshizhe2;
/**
 * 七十二变(抽象装饰者)
 * @author admin
 *
 */
public class Change implements TheGreatestSage{
	private TheGreatestSage sage;
	public Change(TheGreatestSage sage) {
		this.sage=sage;
	}

	@Override
	public void move() {
		sage.move();
	}

}
