package ex4;

public class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	
	public void insert() {
		System.out.println("MySql DB���� ����");
	}
	public void update() {
		System.out.println("MySql DB���� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}
