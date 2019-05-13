package sec06;
 // 객체를 참조하는 배열 
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];   // 타입명 [] 변수명 = new 타입명[배열크기]
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
	}

}
