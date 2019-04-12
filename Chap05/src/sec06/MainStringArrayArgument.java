package sec06;
	// main() 메소드의 매개 변수
public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);   // 프로그램 강제 종료 
		}
		
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);		// 문자열을 정수로 변환 
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	} // 실행 시 매개값을 주지 않았기 때문에 길이 0 인 String배열이 매개값으로 전달.
	// 그렇기 때문에 if문에서 true가 실행  
	// 매개값을 주기 위해선 Run-> Run Configurations...를 선택 후 매개값 주기..

}
