
public class Restaurant {
	private String name;
	private int acceptNum;
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAcceptNum() {
		return acceptNum;
	}

	void setAcceptNum(int acceptNum) {
		this.acceptNum = acceptNum;
	}
	
	Restaurant(String na, int an){
		name = na; acceptNum = an;
	}
	
	int distance(int gn) {
		if (gn < 5) {
			return gn;
		}
		else 
			return -1;
	}
	
	void info() {
		System.out.println("식당 이름 : " + name);
		System.out.println("식당 수용 가능 최대 인원 : " + acceptNum);
	}
	
	

	
	

	
	
	
	
}
