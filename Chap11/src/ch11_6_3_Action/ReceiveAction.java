package ch11_6_3_Action;

public class ReceiveAction implements Action{
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}
