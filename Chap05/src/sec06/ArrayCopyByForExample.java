package sec06;
// for문으로 배열 복사
public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i =0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i = 0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+",");
		}	// 복사되지 않는 항목은 int[]배열의 기본 초기값인 0으로 채워짐!!

	}

}
