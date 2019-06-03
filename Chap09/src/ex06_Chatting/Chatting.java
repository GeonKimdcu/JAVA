package ex06_Chatting;

public class Chatting {
	void startChat(String chatId) {   //(String final chatId) final 생략 그래서 chatId
		String nickName = null;
		//nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
