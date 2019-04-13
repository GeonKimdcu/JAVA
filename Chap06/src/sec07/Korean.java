package sec07;
// 생성자에서 필드 초기화
public class Korean {
	// 필드
	String nation = "대한민국";
	String name;		//생성자에서 name에 n이라는 값을 줌
	String ssn;			// 생성자에서 ssn에 s라는 값을 줌
	
	// 생성자
	public Korean(String n, String s) {   //public + 클래스  (매개값)
		name = n;
		ssn = s;
	}
}
