package sec03;
// 1���� 100���� ���� ���
public class WhileSume1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {		// while(���ǽ�)  �״��� ���๮ 
			sum+= i;
			i++;
		}
		System.out.println("1~100 ��: " + sum);
	}

}
