package ch07_8_4_Animal;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();
}
