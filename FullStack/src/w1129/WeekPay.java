package w1129;

//�� ������� �ֱް�꿡 �ʿ��� �����͸� ��´�.
public class WeekPay {
		String name;
		int per_pay;
		int work_time;
		int base_pay;
		int over_pay;
		int total_pay;
		
	//Ŭ���� �ȿ��� ���콺 ������ ��ư - source - Generate Constructors from Superclass
	// �⺻ ������ �����

	public WeekPay() {
		super();
		this.name = "";
		this.work_time = 20;
		this.per_pay = 10000;		
	}

	public WeekPay(String name, int per_pay, int work_time) {
		super();
		this.name = name;
		this.per_pay = per_pay;
		this.work_time = work_time;
	}
	
}

