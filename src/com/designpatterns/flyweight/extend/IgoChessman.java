//designpatterns.flyweight.extend.IgoChessman.java
package com.designpatterns.flyweight.extend;

//Χ�������ࣺ������Ԫ��
public abstract class IgoChessman {
	public abstract String getColor();
	
	public void display(Coordinates coord){
		System.out.println("������ɫ��" + this.getColor() + "������λ�ã�" + coord.getX() + "��" + coord.getY() );	
	}
}

