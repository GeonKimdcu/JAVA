package sec10;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		  Singleton obj1 = new Singleton();    // 컴파일 에러       private 문에 외부 클래스에서 읽을 수 없기 때문임!
		  Singleton obj2 = new Singleton();		// 컴파일 에러
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {				// 싱글톤은 단하나의 객체만 생성하기 때문에 같은 객체를 가짐.
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}

}
