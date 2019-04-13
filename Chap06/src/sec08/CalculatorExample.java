package sec08;
// 메소드 호출
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();  // 객체생성
		myCalc.powerOn();   // 메소드호출
		
		int result1 = myCalc.plus(5, 6);   //메소드호출 (매개값주어짐)
		System.out.println("result1 : " +result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " +result2);
		
		myCalc.powerOff();

	}

}
