package w1129;

//�� ������� �ֱް�꿡 �ʿ��� �����͸� ��´�.
public class WeekPay {
		String name;
		int per_pay; //�޿��ܰ�
		int work_time; //���� �ð�
		int base_pay; //�⺻�޿�
		int over_pay; //�߰�����
		int total_pay; //��ü�޿�
		
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
	
	//�޿���� �Լ� �ۼ��ϱ�
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

