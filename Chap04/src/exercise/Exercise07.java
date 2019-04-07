package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;		//잔고
		
		Scanner scanner = new Scanner(System.in); 
		// ctrl + shift + o 하면  import 구문 자동생성
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			
			int menuNum = scanner.nextInt();   // 키보드로 부터 입력된 수를 가지고 오는 것임.
			
			switch(menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
					run = false;	// run을 false로 바꾸면서 while반복문 종료
					break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
