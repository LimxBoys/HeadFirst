package com.limx.guanchazhe;
/**
 * 具体观察者
 * @author admin
 *
 */
public class StatisticsDisplay implements Observer,DisplayElement{
	private float presure;
	private Subject subject;
	public StatisticsDisplay(Subject subject) {
		this.subject=subject;
		this.subject.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplay presure:"+presure);
	}

	@Override
	public void update(float temp, float humidity, float presure) {
		this.presure=presure;
		display();
	}

}
