package ch11_6_3_Action;

public class SendAction implements Action{
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}
