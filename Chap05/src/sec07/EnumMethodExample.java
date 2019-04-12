package sec07;
// ���� ��ü�� �޼ҵ� 
public class EnumMethodExample {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		// name() �޼ҵ�      ���� ��ü�� ������ �ִ� ���ڿ��� ����
		String name = today.name();
		System.out.println(name);
		
		// ordinal() �޼ҵ�   ��ü ���� ��ü �� �� ��° ���� ��ü���� �˷��� 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compareTo() �޼ҵ�       ���Ű�ü�� �������� �� ��° ��ġ�ϴ��� ��  
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() �޼ҵ�    �Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� �����Ѵ�.
		 if(args.length == 1) {
			String strDay = args[0];   
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���!");
			} else {
				System.out.println("���� �̱���!");
			}
		}
		
		// values() �޼ҵ�   ����Ÿ���� ��� ���� ��ü���� �迭�� ����� �����Ѵ�. 
		Week[]days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
