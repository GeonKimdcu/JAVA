package exercise;
// NaN�� �˻��ϴ� �ڵ�
public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;	// y���� 0.0�̱� ������ z ���� NaN �� ����.
			//NaN���� �˻��ϴ� �ڵ�  => Double.isNaN( )
		if(Double.isNaN(z)) {	//NaN���̸� true �ƴϸ� false  
			System.out.println("0.0���� ���� �� �����ϴ�.");
		}  else {
			double result = z + 10;
			System.out.println("���" + result);
		}
	}

}
