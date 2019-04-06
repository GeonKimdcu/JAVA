//변수의 사용 범위
package sec01;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if( v1 > 10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;   	 v2변수는 if메소드 블록에서만 사용가능해서 컴파일 에러 발생!!
	}

}
