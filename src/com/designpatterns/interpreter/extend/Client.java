package designpatterns.interpreter.extend;

public class Client {
	public static void main(String[] args){
		String text = "LOOP 2 PRINT Ñî¹ý SPACE SPACE PRINT Ð¡ÁúÅ® BREAK END PRINT ¹ù¾¸ SPACE SPACE PRINT »ÆÈØ";
		Context context = new Context(text);
			
		Node node = new ExpressionNode();
		node.interpret(context);
		node.execute();
	}
}
