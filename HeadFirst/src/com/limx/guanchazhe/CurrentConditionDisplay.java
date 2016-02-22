package com.limx.guanchazhe;
/**
 * 具体观察者
 * @author admin
 *
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidtiy;
	private Subject subject;
	public CurrentConditionDisplay(Subject subject) {
		this.subject=subject;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Currnt conditions:"+temperature+"F degrees and "+humidtiy+"% humdity");
		
	}

	@Override
	public void update(float temp, float humidity, float presure) {
		this.temperature=temp;
		this.humidtiy=humidity;
		display();
		
	}

}
