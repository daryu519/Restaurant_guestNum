
public class Main {

	public static void main(String[] args) {
		
		Restaurant yooKitchen = new Restaurant("윤식당", 17);
		
		Calculator guestNumber = new Calculator("안녕하세요. 손님계산기입니다.", 4);
		
		yooKitchen.info();
		guestNumber.in(2, yooKitchen);
		guestNumber.in(3, yooKitchen);
		guestNumber.in(5, yooKitchen);
		guestNumber.in(6, yooKitchen);
		guestNumber.in(4, yooKitchen);
		guestNumber.in(4, yooKitchen);
		guestNumber.in(3, yooKitchen);
		
		guestNumber.condition(yooKitchen);
		
		
	}

}
