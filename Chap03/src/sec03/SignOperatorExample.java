package sec03;

public class SignOperatorExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		/* byte byteValue3 = byteValue1 + byteValue2; ������ ����
		�ڹٴ� ���� ������ ��� int Ÿ���� �⺻���� �Ѵ�. �׷��� ������  int = byte + byte �� �Ǿ� ��!!!! */
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		/* char charValue3 = charValue1 + charValue2;  ������ ����
		 intŸ�� ���� ���� ���������� ������ intŸ������ ��ȯ�� �� ���� ���� �׷��⿡ char�� ������ ����!  byte, char, short������ */
		int intValue2 = charValue1 + charValue2; // 'A' + 1 
		System.out.println("�����ڵ�=" + intValue2);  // 'A'�� �����ڵ庸�� 1�� ū �����ڵ尡 ���� �� B��  ��
		System.out.println("��¹���=" + (char)intValue2);  // B ��� 
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);  // �����κб����� ���� ���
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   �����Ͽ���
		double doubleValue = intValue5 / 4.0; // �Ǽ� �κб����� ���� ���
		System.out.println(doubleValue);

	}

}
