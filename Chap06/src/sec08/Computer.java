package sec08;
// 매개 변수의 수를 모를 경우
public class Computer {
	int sum1(int[] values) {     // 메소드 생성 - 타입 메소드(매개변수) {실행내용]
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {    // " ... " 을 사용하면 배열생성없이 바로 배열타입의 매개값 사용가능
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
