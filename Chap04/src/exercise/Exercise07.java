package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;		//�ܰ�
		
		Scanner scanner = new Scanner(System.in); 
		// ctrl + shift + o �ϸ�  import ���� �ڵ�����
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			
			int menuNum = scanner.nextInt();   // Ű����� ���� �Էµ� ���� ������ ���� ����.
			
			switch(menuNum) {
			case 1:
				System.out.print("���ݾ�>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("�ܰ�>");
				System.out.println(balance);
				break;
			case 4:
					run = false;	// run�� false�� �ٲٸ鼭 while�ݺ��� ����
					break;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");

	}

}
