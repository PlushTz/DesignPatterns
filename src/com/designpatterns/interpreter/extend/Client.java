package com.designpatterns.interpreter.extend;

public class Client {
	public static void main(String[] args){
		String text = "LOOP 2 PRINT ��� SPACE SPACE PRINT С��Ů BREAK END PRINT ���� SPACE SPACE PRINT ����";
		Context context = new Context(text);
			
		Node node = new ExpressionNode();
		node.interpret(context);
		node.execute();
	}
}
