package ch11_5_3_CurrentTimeMillis;

public class SystemmTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i =1; i <= 2; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + "�����ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
