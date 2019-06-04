package ex07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {   // Exception = �θ� / e = ��ü
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	 // ����Ÿ�� �޼ҵ��(�Ű�����,...) throws ����Ŭ����1, ����Ŭ����2
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if(!id.contentEquals("blue")) {
		throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
	}
		
	if(!password.contentEquals("12345")) {
		throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
