package sec07;
// �����ڿ��� �ʵ� �ʱ�ȭ
public class Korean {
	// �ʵ�
	String nation = "���ѹα�";
	String name;		
	String ssn;			
	
	// ������
	public Korean(String name, String ssn) {   //public + Ŭ����  (�Ű���)
		this.name = name;		// this.�ʵ� ����ϸ� �ʵ�� �Ű��������� �����ص� �ذᰡ����! 
		this.ssn = ssn;		// this.�ʵ� = �Ű�����;
	}
}
