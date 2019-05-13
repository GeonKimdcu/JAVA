package sec07;
// 생성자를 호출해서 객체 생성
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// Car myCar = new Car();  (x) 기본생성자 호출 할 수 없음.
		// 왜냐하면 Car클래스에 생성자 선언이 있었기 때문에 기본 생성자를 호출해서 객체 생성x

	}

}