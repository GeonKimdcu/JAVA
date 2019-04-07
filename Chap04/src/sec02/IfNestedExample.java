package sec02;
// ÁßÃ¸ if¹®
public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) +81;
		System.out.println("Á¡¼ö: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";  // Áß
			} else {		   // Ã¸
				grade = "A";   // if¹®
			} 
		} else {
			if(score >=85) {	//Áß
				grade = "B+";	//Ã¸
			} else {			// if¹®
				grade = "B";
			}
		}
		System.out.println("ÇÐÁ¡: " + grade);
	}

}
