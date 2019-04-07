package exercise;
// 사다리꼴 넓이 구하는 코드
public class Exercise06 {

	public static void main(String[] args) {
	int lengthTop = 5;  	// 윗변
	int lengthBottom = 10;	//아랫변
	int height = 7;			//높이
	double area = ((lengthTop + lengthBottom)*height) * 0.5;
	// * 0.5 = 1/2 임   혹은  /2.0 을 해주어도 됨. 그러나, /2는 정수화 되기때문에 불가능함!
	System.out.println(area);
	// 사다리꼴 넓이 공식 = 1/2(윗변 + 아랫변)*높이
	}

}
