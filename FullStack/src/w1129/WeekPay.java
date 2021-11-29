package w1129;

//한 사람분의 주급계산에 필요한 데이터를 담는다.
public class WeekPay {
		String name;
		int per_pay;
		int work_time;
		int base_pay;
		int over_pay;
		int total_pay;
		
	//클래스 안에서 마우스 오른쪽 버튼 - source - Generate Constructors from Superclass
	// 기본 생성자 만들기

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

