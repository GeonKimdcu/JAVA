package sec07;
// �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�
public class Car2 {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car2() {
		}
	
	Car2(String model) {
		this(model, "����", 250);			//ȣ��
	}
	Car2(String model, String color) {		//ȣ��
		this(model, color, 250);
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;    // ���� ���� �ڵ�
	}
}