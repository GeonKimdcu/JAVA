package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);   // 유니코드로 변환 
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;		// 소수점은 버려짐 
		System.out.println(intValue);

		int intValue1 = 10;
		double doubleValue2 = 5.5;
		double result = (double)intValue1 + doubleValue2;  // 잃는 값 없이 출력
		System.out.println(result);
	} 

}
