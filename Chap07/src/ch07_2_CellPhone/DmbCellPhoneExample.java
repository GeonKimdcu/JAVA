package ch07_2_CellPhone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmdCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ű� ����ġŲ�� �ΰ���?");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ���� �˹ٻ� �����ε���");
		dmbCellPhone.sendVoice("��Ʈ�޴� 3�� ����Ͽ콺�� ��Ź����� ���� ����!");
		dmbCellPhone.receiveVoice("�� �Ͼ� �ն���ġŲ ���Կ��� �׻� �����մϴ�^^");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
