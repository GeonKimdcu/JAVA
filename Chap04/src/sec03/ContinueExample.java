package sec03;
// continue�� ����� for��
public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {  //¦���� ����ϴ� �ڵ�
				continue;  //Ȧ�����̳����� continue �� ���� ��������ʰ� �ٽ� �ݺ������� �Ѿ
			}
			System.out.println(i);
		}

	}

}
