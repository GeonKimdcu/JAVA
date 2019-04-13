package sec07;
// 생성자에서 필드 초기화
public class Korean {
	// 필드
	String nation = "대한민국";
	String name;		
	String ssn;			
	
	// 생성자
	public Korean(String name, String ssn) {   //public + 클래스  (매개값)
		this.name = name;		// this.필드 사용하면 필드와 매개변수명이 동일해도 해결가능함! 
		this.ssn = ssn;		// this.필드 = 매개변수;
	}
}
