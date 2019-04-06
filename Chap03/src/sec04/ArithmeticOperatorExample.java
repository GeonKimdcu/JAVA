// 산술 연산자
package sec04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 =5;
		int v2 =2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3= v1 * v2;
		System.out.println("result3=" +result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" +result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double)v1 / v2;
		System.out.println("result6=" + result6); /*소수점을 나타내고 싶으면 int1 ,int2
		 둘 중 하나를 강제타입변환(캐스팅) 한 후 산술 연산을 하면 됨. 혹은 (int1 * 1.0)을 한후 실수 타입으로 만든 후 
		 산술 연산을 하는 방법도 있음 */ 

	}

}
