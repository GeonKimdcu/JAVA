package ch11_6_3_Action;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("ch11_6_3_Action.ReceiveAction");
			Class clazz2 = Class.forName("ch11_6_3_Action.SendAction");
		
			Action action = (Action) clazz1.newInstance();
			Action action2 = (Action) clazz2.newInstance();
			
		action.execute();
		action2.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
