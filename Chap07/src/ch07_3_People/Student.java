package ch07_3_People;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  //  부모 생성자 호출... 반드시 생성자 첫 줄에 super() 사용!
		this.studentNo = studentNo;
	}
}
