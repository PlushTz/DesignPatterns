//designpatterns.factorymethod.LoggerFactory.java
package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.Logger;

//��־��¼�������ӿڣ��䵱���󹤳���ɫ
public interface LoggerFactory {
	public Logger createLogger(); //���󹤳�����
}
