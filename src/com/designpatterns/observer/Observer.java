//designpatterns.observer.Observer.java
package com.designpatterns.observer;

//����۲���
public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); //����֧Ԯ���ѷ���
	public void beAttacked(AllyControlCenter acc); //�������ܹ�������
}
