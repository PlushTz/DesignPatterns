package com.designpatterns.interpreter.extend;

//����ڵ��ࣺ������ʽ
public abstract class Node {
	public abstract void interpret(Context text); //����һ���������ڽ������
	public abstract void execute(); //����һ����������ִ�б�Ƕ�Ӧ������
}
