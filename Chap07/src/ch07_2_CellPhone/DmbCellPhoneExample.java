package ch07_2_CellPhone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmdCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("거기 땅땅치킨집 인가요?");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 땅땅 알바생 배경민인데요");
		dmbCellPhone.sendVoice("세트메뉴 3번 써니하우스로 부탁드려요 서비스 팍팍!");
		dmbCellPhone.receiveVoice("네 하양 왕땅땅치킨 고객님에게 항상 감사합니다^^");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
