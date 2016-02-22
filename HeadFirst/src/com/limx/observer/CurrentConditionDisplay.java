package com.limx.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidtiy;
	private Observable observable;
	public CurrentConditionDisplay(Observable observable) {
		this.observable=observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Currnt conditions:"+temperature+"F degrees and "+humidtiy+"% humdity");
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData) o;
			this.temperature=weatherData.getTemp();
			this.humidtiy=weatherData.getHumidity();
			display();
		}

	}

}
