package com.designpatterns.interpreter.extend;

import java.util.*;

//�����ࣺ���ڴ洢�Ͳ�����Ҫ���͵���䣬�ڱ�ʵ����ÿһ����Ҫ���͵ĵ��ʿ��Գ�Ϊһ���������(Action Token)������
public class Context {
	private StringTokenizer tokenizer; //StringTokenizer�࣬���ڽ��ַ����ֽ�Ϊ��С���ַ������(Token)��Ĭ��������Կո���Ϊ�ָ���
	private String currentToken; //��ǰ�ַ������
	
	public Context(String text) {
		tokenizer = new StringTokenizer(text); //ͨ�������ָ���ַ�������StringTokenizer����
		nextToken();
	}
	
	//������һ�����
	public String nextToken() {
		if (tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		}
		else {
			currentToken = null;
		}
		return currentToken;
	}
	
	//���ص�ǰ�ı��
	public String currentToken() {
		return currentToken;
	}
	
	//����һ�����
	public void skipToken(String token) {
		if (!token.equals(currentToken)) {
			System.err.println("������ʾ��" + currentToken + "���ʹ���");
			}
		nextToken();
	}
	
	//�����ǰ�ı����һ�����֣��򷵻ض�Ӧ����ֵ
	public int currentNumber() {
		int number = 0;
		try{
			number = Integer.parseInt(currentToken); //���ַ���ת��Ϊ����
		}
		catch(NumberFormatException e) {
			System.err.println("������ʾ��" + e);
		}
		return number;
	}
}
