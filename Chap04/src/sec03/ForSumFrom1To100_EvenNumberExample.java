package sec03;
// 1~100까지 짝수들의 합
public class ForSumFrom1To100_EvenNumberExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		
	}System.out.println("1~100 합 : " +sum);

	}
}

