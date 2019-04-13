package sec07;
// 생성자의 오버로딩 
public class Car1 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자   // 생성자명은 클래스명과 동일해야함!
	Car1() {				// 1.생성자
	}
	
	Car1(String model) {				// 2.생성자
		this.model = model;
	}
	
	Car1(String model, String color) {		//3.생성자
		this.model = model;
		this.color = color;
	}
	
	Car1(String model, String color, int maxSpeed) {  // 4.생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
