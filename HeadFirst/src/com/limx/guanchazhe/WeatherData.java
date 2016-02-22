package com.limx.guanchazhe;

import java.util.ArrayList;

public class WeatherData implements Subject{
	@SuppressWarnings("rawtypes")
	private ArrayList observers=new ArrayList();
	private float temp;
	private float humidity;
	private float presure;
	@SuppressWarnings("unchecked")
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		if(observer!=null)
			observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer!=null)
			observers.remove(observer);
	}

	@Override
	public void notifyobserver() {
		if(observers!=null&&observers.size()!=0){
			for(int i=0;i<observers.size();i++){
				Observer observer=(Observer) observers.get(i);
				observer.update(temp, humidity, presure);
			}
		}
	}
	public void setmeasurementsChanger(float temperature,float humidity,float pressure){
		this.temp=temperature;
		this.humidity=humidity;
		this.presure=pressure;
		notifyobserver();
	}
}
