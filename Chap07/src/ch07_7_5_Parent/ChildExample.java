package ch07_7_5_Parent;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = new Child();
		child.field2 = "yyy";
		child.method3();

	}

}
