package w1130PCT;
import java.util.Scanner;
import java.util.ArrayList;

public class PCTDao {
	Scanner sc = new Scanner(System.in);
	ArrayList<PCTData> list = new ArrayList<PCTData>();
	
	public void append() {
		PCTData data = new PCTData();
		
		System.out.print("이름 : ");
		data.setName(sc.next());
		
		data.setWrite( getScore("필기", 400));	 // 0~400
		data.setWord( getScore("워드", 200)); 	 // 0~200
		data.setSpread( getScore("스프레드", 200)); // 0~200
		data.setPpt( getScore("프리젠트", 200)); 	 // 0~200
		
		data.calculate();
		
		list.add(data);
	}
	
	int getScore(String subject, int limit) {
		int temp;
		System.out.printf("%s : ", subject);
		temp = sc.nextInt();
		while(temp<0 || temp>limit) {
			System.out.printf("0~%d 범위의 값만 입력하세요\n", limit);
			System.out.printf("%s : ", subject);
			temp = sc.nextInt();
		}
		return temp;
	}
	
	public void output() {
		for(PCTData pct : list) {
			System.out.printf("%s %d %d %d %d %d %s\n", pct.getName(), pct.getWrite(), 
					pct.getWord(), pct.getPpt(), pct.getSpread(), pct.getTotal(), pct.getGrade());
		}
	}
	
	public void start() {
		append();
		append();
		output();		
	}
	
	public void menuDisplay() {
		System.out.println("----------------");
		System.out.println("      메뉴       ");
		System.out.println("----------------");
		System.out.println("    1. 입력      ");
		System.out.println("    2. 출력      ");
		System.out.println("    3. 검색      ");
		System.out.println("    0. 종료      ");
		System.out.println("--------------- ");
	}
	
	public void start2() {
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: append(); break;
			case 2: output(); break;
			case 3: System.out.println("검색"); break;
			case 0: System.out.println("프로그램을 종료합니다.");
				return;
			default: System.out.println("ㅎㅎ");
			}
		}
	}
}
