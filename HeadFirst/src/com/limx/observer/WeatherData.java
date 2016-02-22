package com.limx.observer;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private float temp;
	private float humidity;
	private float presure;
	
	public WeatherData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void measurementsChanger(){
		setChanged();
		notifyObservers();
	}
	public void setmeasurementsChanger(float temperature,float humidity,float pressure){
		this.temp=temperature;
		this.humidity=humidity;
		this.presure=pressure;
		measurementsChanger();
	}
	public float getTemp() {
		return temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPresure() {
		return presure;
	}
	
}
