package ch07_3_People;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  //  �θ� ������ ȣ��... �ݵ�� ������ ù �ٿ� super() ���!
		this.studentNo = studentNo;
	}
}
