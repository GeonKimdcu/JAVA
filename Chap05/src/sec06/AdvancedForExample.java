package sec06;
// 향상된 for문
public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		
		for(int score:scores) {    /* 향상된 for문 괄호안에는  
		배열에서 꺼낸 항목을 저장할 변수선언과 콜론 그리고 배열을 나란히 작성. 즉(타입변수 : 배열) */
			sum = sum+score;
			}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 : " +avg);

	}

}
