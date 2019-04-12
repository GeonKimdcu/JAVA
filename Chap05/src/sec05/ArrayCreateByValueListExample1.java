package sec05;
// 값 목록으로 배열 생성
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 97};
		
		//scores[2] = 79;  생성된 배열에서 값을 바꾸고 싶을 땐 대입 연산자 사용! 
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
			
		}
		System.out.println("총합 : " +sum);
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);

	}

}
