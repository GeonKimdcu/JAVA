package Chapter05;

public class Q7 {

	public static void main(String[] args) {
		int max =0;
		int[] array = {1,5,3,8,2};
		
		for(int i = 0; i<array.length; i++) {
			if(max < array[i]) {        //max값이 array[i] 배열 값보다 작으면ss
				max = array[i];           // max 에다가 array[i] 배열 값을 대입하는 구조
			}
		}
		System.out.println("max :" + max);

	}

}
