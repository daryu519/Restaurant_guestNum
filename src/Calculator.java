
public class Calculator {
	private String name;
	private int sum;
	
	void setName(String name) {
		this.name = name;
	}
	void setSum(int sum) {
		this.sum = sum;
	}
	
	Calculator(String na, int su){
		name = na; sum = su;
	}
	
	void in(int a, Restaurant yk) {
		if((yk.distance(a) == a) && ((a + sum) <= yk.getAcceptNum())) {
			System.out.println("어서오세요! 환영합니다.");
			sum += a;
		}
		else if((yk.distance(a) == a) && ((a + sum) > yk.getAcceptNum())) {
			System.out.println("입장 가능 인원을 초과했습니다.");
		}
		else
			System.out.println("5인 이상 집합금지로 인해 입장하실 수 없습니다. 죄송합니다.");
	}
		
	void condition(Restaurant yk) {
		System.out.println(name);
		System.out.println("현재 총 인원 : " + sum);
		System.out.println("식당 총 수용 가능 인원 : " + yk.getAcceptNum());
		if((double)sum/yk.getAcceptNum()*100 < 50) {
			System.out.println("매우 쾌적합니다!");
		}
		else if(((double)sum/yk.getAcceptNum()*100 >= 50) && ((double)sum/yk.getAcceptNum()*100 <70)) {
			System.out.println("보통입니다!");
		}
		else 
			System.out.println("사람이 많습니다! 주의하세요!");
	
	}
	
}
