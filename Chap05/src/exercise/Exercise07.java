package exercise;
// �־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����(for���� �̿��ϼ���.)
public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i =0; i<array.length; i++) {
			max = (max < array[i]) ? array[i] : max;
			
			
		}System.out.println("max: " +max);

	}

}
