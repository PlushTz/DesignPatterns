//designpatterns.abstractfactory.SkinFactory.java
package com.designpatterns.abstractfactory;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}