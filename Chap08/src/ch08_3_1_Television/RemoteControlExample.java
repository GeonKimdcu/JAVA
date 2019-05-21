package ch08_3_1_Television; 
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(2);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
	}

}
