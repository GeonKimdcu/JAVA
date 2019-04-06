package sec03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------------");
		x++;
		++x;
		System.out.println("x=" +x);
		
		System.out.println("-------------------------------");
		y--;
		--y;
		System.out.println("y=" +y);
		
		System.out.println("---------------------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------------");
		z= ++x;
		System.out.println("z= "+ z);
		System.out.println("x=" + x);
		
		System.out.println("------------------------------------");
		z = ++x + y++;
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("y=" +y);  // y++은 결과값은 반영안되도 결과 값 뒤에 y값 증가함! 
		

	}

}
