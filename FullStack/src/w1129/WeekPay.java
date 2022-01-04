package w1129;

//한 사람분의 주급계산에 필요한 데이터를 담는다.
public class WeekPay {
		String name;
		int per_pay; //급여단가
		int work_time; //일한 시간
		int base_pay; //기본급여
		int over_pay; //추가수당
		int total_pay; //전체급여
		
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
	
	//급여계산 함수 작성하기
	public void process() {
		base_pay = this.per_pay * this.work_time;
		over_pay = 0;
		if(work_time>20) {
			over_pay = (int)((work_time-20) * per_pay*0.5);
		}
		total_pay = base_pay + over_pay;
	}

	public void output() {
		System.out.printf("%s\t", name);
		System.out.printf("%s\t", work_time);
		System.out.printf("%s\t", per_pay);
		System.out.printf("%s\t", base_pay);
		System.out.printf("%s\t", over_pay);
		System.out.printf("%s\n", total_pay);
	}
}

