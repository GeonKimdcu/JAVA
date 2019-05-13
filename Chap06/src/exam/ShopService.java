package exam;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
}
	
	public static ShopService getInstance() {   // 리턴타입은 클래스 자기자신
		return singleton;
	}
}