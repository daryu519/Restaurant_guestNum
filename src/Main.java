
public class Main {

	public static void main(String[] args) {
		
		Restaurant yooKitchen = new Restaurant("���Ĵ�", 17);
		
		Calculator guestNumber = new Calculator("�ȳ��ϼ���. �մ԰����Դϴ�.", 4);
		
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
