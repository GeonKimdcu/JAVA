package sec03;

public class SignOperatorExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		/* byte byteValue3 = byteValue1 + byteValue2; 컴파일 에러
		자바는 정수 연산일 경우 int 타입을 기본으로 한다. 그렇기 때문에  int = byte + byte 가 되야 함!!!! */
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		/* char charValue3 = charValue1 + charValue2;  컴파일 에러
		 int타입 보다 낮은 정수연산은 무조건 int타입으로 변환된 후 연산 수행 그렇기에 char도 컴파일 에러!  byte, char, short까지임 */
		int intValue2 = charValue1 + charValue2; // 'A' + 1 
		System.out.println("유니코드=" + intValue2);  // 'A'의 유니코드보다 1이 큰 유니코드가 저장 즉 B의  값
		System.out.println("출력문자=" + (char)intValue2);  // B 출력 
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);  // 정수부분까지의 몫을 출력
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   컴파일에러
		double doubleValue = intValue5 / 4.0; // 실수 부분까지의 몫을 출력
		System.out.println(doubleValue);

	}

}
