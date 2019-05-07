package ch07_4_1_Computer;

public class Computer extends Calculator{
	@Override  // 생략가능함  But 정확한 코딩을 위해서 오버라이딩 어노테이션 사용!
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *r*r;  /*Math는 수학계산과 관련된 필드와 메소드들을 가지고 있는 클래스
		areaCircle( ) 메소드는 PI라는 상수 이용하였음*/
	}
}
