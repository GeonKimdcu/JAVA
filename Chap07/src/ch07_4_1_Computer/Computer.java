package ch07_4_1_Computer;

public class Computer extends Calculator{
	@Override  // ����������  But ��Ȯ�� �ڵ��� ���ؼ� �������̵� ������̼� ���!
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI *r*r;  /*Math�� ���а��� ���õ� �ʵ�� �޼ҵ���� ������ �ִ� Ŭ����
		areaCircle( ) �޼ҵ�� PI��� ��� �̿��Ͽ���*/
	}
}
