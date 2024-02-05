//designpatterns.flyweight.simple.IgoChessman.java
package com.designpatterns.flyweight.simple;

//Χ�������ࣺ������Ԫ��
public abstract class IgoChessman {
	public abstract String getColor();

	public void display() {
		System.out.println("������ɫ��" + this.getColor());	
	}
}
