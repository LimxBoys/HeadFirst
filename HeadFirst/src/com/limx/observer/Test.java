package com.limx.observer;

public class Test {
	public static void main(String[] args) {
		WeatherData weatherdata=new WeatherData();
		CurrentConditionDisplay conditionDisplay=new CurrentConditionDisplay(weatherdata);
		StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherdata);
		weatherdata.setmeasurementsChanger(78, 90, 29.2f);
		weatherdata.setmeasurementsChanger(71, 91, 28.3f);
		
	}
}
