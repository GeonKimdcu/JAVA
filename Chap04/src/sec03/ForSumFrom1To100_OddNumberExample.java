package sec03;
// 1~100���� Ȧ������ ��
public class ForSumFrom1To100_OddNumberExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i=i+2) {  // i= i + 2 �� Ȧ���� ���ϰ� ����.
			sum = sum + i;
		}
		System.out.println("1~100���� Ȧ������ �� : " + sum);
	}

}
