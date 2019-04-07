package sec03;
// continue를 사용한 for문
public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {  //짝수만 출력하는 코드
				continue;  //홀수값이나오면 continue 로 인해 실행되지않고 다시 반복문으로 넘어감
			}
			System.out.println(i);
		}

	}

}
