package sec04;
// ¹®ÀÚ¿­ºñ±³
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "½Å¹ÎÃ¶";
		String strVar2 = "½Å¹ÎÃ¶";
		String strVar3 = new String("½Å¹ÎÃ¶");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println( );
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		// str1.equals(str2)     str1Àº ¿øº» ¹®ÀÚ¿­   + .equal + (str2) ºñ±³¹®ÀÚ¿­! 

	}

}
