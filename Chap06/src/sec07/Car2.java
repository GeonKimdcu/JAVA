package sec07;
// 다른 생성자를 호출해서 중복 코드 줄이기
public class Car2 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2() {
		}
	
	Car2(String model) {
		this(model, "은색", 250);			//호출
	}
	Car2(String model, String color) {		//호출
		this(model, color, 250);
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;    // 공통 실행 코드
	}
}
