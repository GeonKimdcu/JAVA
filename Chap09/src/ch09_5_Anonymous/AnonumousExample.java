package ch09_5_Anonymous;

public class AnonumousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.method1();
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("Smart TV¸¦ ÄÕ´Ï´Ù.");
					}
					@Override
					public void turnOff() {
						System.out.println("smart Tv¸¦ ²ü´Ï´Ù.");
					}
				}
				);
	}

}
