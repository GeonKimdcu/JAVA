package sec07;

import java.util.Calendar;  // Calendar 클래스는 java.util 패키지에 있으므로 import가 필요! 

// 열거 타입과 열거 상수
public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null ;     // 열거 타입 변수 선언  꼭 null값 지정해야함 !!
		
		Calendar cal = Calendar.getInstance();  // Calendar.getInstance() 라는 메소드 호출
		int week = cal.get(Calendar.DAY_OF_WEEK);  // get()메소드 호출  ...   일(1)~토(7)까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;   //  today == Week.SUNDAY => 열거 상수 대입 
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today= Week.SATURDAY;
			break;
			
		}
		 System.out.println("오늘 요일 : " + today);
		 
		 if(today == Week.SUNDAY) {
			 System.out.println("일요일에는 축구를 합니다.");
		 } else {
			 System.out.println("열심히 자바 공부합니다.");
		 }

	}

}
