package sec08;
// �Ű� ������ ���� �� ���
public class Computer {
	int sum1(int[] values) {     // �޼ҵ� ���� - Ÿ�� �޼ҵ�(�Ű�����) {���೻��]
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {    // " ... " �� ����ϸ� �迭�������� �ٷ� �迭Ÿ���� �Ű��� ��밡��
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
