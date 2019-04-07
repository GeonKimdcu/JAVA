package sec03;
// 1~100까지 홀수들의 합
public class ForSumFrom1To100_OddNumberExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i=i+2) {  // i= i + 2 는 홀수만 더하게 해줌.
			sum = sum + i;
		}
		System.out.println("1~100까지 홀수들의 합 : " + sum);
	}

}
