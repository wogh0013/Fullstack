package w1129;

public class WeekPayProject {
	public static void main(String[] args) {
		WeekPayManager mgr = new WeekPayManager();
		mgr.start();
		
//		//한 명만 처리
//		WeekPay week = new WeekPay("홍길동", 10000, 30);
//		week.process();
//		week.output();
//		System.out.println();
//		
//		//여러 명을 처리
//		WeekPay[] pays = new WeekPay[5];
//		pays[0] = new WeekPay("가", 20000, 15);
//		pays[1] = new WeekPay("나", 10000, 30);
//		pays[2] = new WeekPay("다", 30000, 25);
//		pays[3] = new WeekPay("라", 12000, 20);
//		pays[4] = new WeekPay("마", 25000, 25);
//		
//		for(int i=0; i<pays.length; i++) {
//			pays[i].process();
//		}
//		
//		for(int i=0; i<pays.length; i++) {
//			pays[i].output();
//		}
		
//		WeekPayManager mgr = new WeekPayManager();
//		mgr.append();
//		mgr.append();
//		mgr.output();
	}
}
