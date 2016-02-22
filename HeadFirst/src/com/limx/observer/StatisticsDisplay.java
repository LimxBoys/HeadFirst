package com.limx.observer;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement{
	private float presure;
	private Observable observable;
	public StatisticsDisplay(Observable observable) {
		this.observable=observable;
		this.observable.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplay presure:"+presure);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData) o;
			this.presure=weatherData.getPresure();
			display();
		}
		
	}

}
