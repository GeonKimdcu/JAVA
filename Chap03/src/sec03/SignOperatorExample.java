package sec03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		/* short result3 = -s; �����Ͽ���
		 ��ȣ �������� ���� Ÿ���� int Ÿ��!!	=> shortŸ�� ���� ��ȣ�����ϸ� intŸ�� ������ �ٲ��. */
		int result3 = -s;
		System.out.println("result3=" + result3);
	}
}
