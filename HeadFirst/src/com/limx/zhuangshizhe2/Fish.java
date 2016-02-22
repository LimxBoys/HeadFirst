package com.limx.zhuangshizhe2;

public class Fish extends Change{

	public Fish(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move() {
		super.move();
		System.out.println("Fish move");
	}
}
