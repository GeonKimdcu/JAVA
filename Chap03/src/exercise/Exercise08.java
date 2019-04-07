package exercise;
// NaN을 검사하는 코드
public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;	// y값이 0.0이기 때문에 z 에는 NaN 이 저장.
			//NaN인지 검사하는 코드  => Double.isNaN( )
		if(Double.isNaN(z)) {	//NaN값이면 true 아니면 false  
			System.out.println("0.0으로 나눌 수 없습니다.");
		}  else {
			double result = z + 10;
			System.out.println("결과" + result);
		}
	}

}
