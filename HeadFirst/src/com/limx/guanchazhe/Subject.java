package com.limx.guanchazhe;
/**
 * 抽象主题(接口或者抽象类)
 * @author admin
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);    
	public void removeObserver(Observer observer);
	public void notifyobserver();
}
