package exercise;
// 4x + 5y = 60�� ��� �ظ� ���ؼ� (x,y) ���·� ���
//��, x�� y�� 10������ �ڿ���
public class Exercise05 {

	public static void main(String[] args) {
		int x;
		int y;
		for(x = 1; x <=10; x++) {
			for(y = 1; y <=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
