package ex07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {   // Exception = 부모 / e = 객체
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	 // 리턴타입 메소드명(매개변수,...) throws 예외클래스1, 예외클래스2
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if(!id.contentEquals("blue")) {
		throw new NotExistIDException("아이디가 존재하지 않습니다.");
	}
		
	if(!password.contentEquals("12345")) {
		throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
