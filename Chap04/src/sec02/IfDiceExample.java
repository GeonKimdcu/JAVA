package sec02;
// 주사위의 번호를 뽑는 예제
public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		/* 임의의 정수를 뽑는 메소드 => (int)Math.random()*n) + start; 
		start부터 시작하는 n개의 정수 중에서 임의의 정수 하나를 얻는 연산식
		즉 1부터 시작해서 6개의 정수 중에서 임의의 정수를 출력.  */
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		}

}
