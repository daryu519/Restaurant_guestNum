
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
			System.out.println("�������! ȯ���մϴ�.");
			sum += a;
		}
		else if((yk.distance(a) == a) && ((a + sum) > yk.getAcceptNum())) {
			System.out.println("���� ���� �ο��� �ʰ��߽��ϴ�.");
		}
		else
			System.out.println("5�� �̻� ���ձ����� ���� �����Ͻ� �� �����ϴ�. �˼��մϴ�.");
	}
		
	void condition(Restaurant yk) {
		System.out.println(name);
		System.out.println("���� �� �ο� : " + sum);
		System.out.println("�Ĵ� �� ���� ���� �ο� : " + yk.getAcceptNum());
		if((double)sum/yk.getAcceptNum()*100 < 50) {
			System.out.println("�ſ� �����մϴ�!");
		}
		else if(((double)sum/yk.getAcceptNum()*100 >= 50) && ((double)sum/yk.getAcceptNum()*100 <70)) {
			System.out.println("�����Դϴ�!");
		}
		else 
			System.out.println("����� �����ϴ�! �����ϼ���!");
	
	}
	
}
