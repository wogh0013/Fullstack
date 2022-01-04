package w1129;
import java.util.Scanner;

public class WeekPayManager {
	
	//데이터
	final int MAX = 3;
	WeekPay[] pays = new WeekPay[MAX]; // 추후 컬렉션클래스 ArrayList를 쓸 거임
	Scanner sc = new Scanner(System.in);
	int count = 0; // 실제로 사용 중인 배열 개수
	
	public WeekPayManager() {
		for(int i=0; i<pays.length; i++) {
			pays[i] = new WeekPay();
		}
	}
	
	public void append() {
		System.out.printf("이름 : ");
		pays[count].name = sc.next();
		
		System.out.printf("급여단가 : ");
		pays[count].per_pay = sc.nextInt();
		
		System.out.printf("근무시간 : ");
		pays[count].work_time = sc.nextInt();
		
		count++;
	}
	
	public void output() {
		for(int i=0; i<count; i++) {
			pays[i].process();
			pays[i].output();
		}
	}
	
	public void start() {
		while(true) { //무한루프
			System.out.println("1. 추가");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1: append(); break;
			case 2: output(); break;
			case 0: System.out.println("프로그램을 종료합니다.");
				//switch문은 break로 종료해도 while문을 종료하려면 별도의 작업을 해야 한다.
				//bool변수를 만들어서 처리를 해도 되지만 여기서는 함수를 종료함
				//어차피 종료니까 굳이 while문을 종료하지 말고 함수를 종료하자
				return; //함수를 종료한다
			}
			
		}
	}
}
