package sec02;
// ��ø if��
public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) +81;
		System.out.println("����: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";  // ��
			} else {		   // ø
				grade = "A";   // if��
			} 
		} else {
			if(score >=85) {	//��
				grade = "B+";	//ø
			} else {			// if��
				grade = "B";
			}
		}
		System.out.println("����: " + grade);
	}

}
