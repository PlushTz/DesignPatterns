package com.designpatterns.interpreter.extend;

//�������ڵ��ࣺ���ս�����ʽ
public class CommandNode extends Node {
	private Node node;
	
	public void interpret(Context context) {
      //����LOOPѭ������
		if (context.currentToken().equals("LOOP")) {
			node = new LoopCommandNode();
			node.interpret(context);
		}
      //����������������
		else {
			node = new PrimitiveCommandNode();
			node.interpret(context);
		}
	}
	
	public void execute() {
		node.execute();
	}
}