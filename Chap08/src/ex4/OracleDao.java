package ex4;

public class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	
	public void insert() {
		System.out.println("Oracle DB���� ����");
	}
	public void update() {
		System.out.println("Oracle DB���� ����");
	}
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}
