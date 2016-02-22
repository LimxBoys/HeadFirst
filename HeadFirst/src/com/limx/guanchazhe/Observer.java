package com.limx.guanchazhe;
/**
 * 抽象观察者接口
 * @author admin
 *
 */
public interface Observer {
	public void update(float temp,float humidity,float presure);
}
