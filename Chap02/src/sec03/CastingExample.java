package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);   // �����ڵ�� ��ȯ 
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;		// �Ҽ����� ������ 
		System.out.println(intValue);

		int intValue1 = 10;
		double doubleValue2 = 5.5;
		double result = (double)intValue1 + doubleValue2;  // �Ҵ� �� ���� ���
		System.out.println(result);
	} 

}
