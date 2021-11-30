package w1130PCT;
import java.util.Scanner;
import java.util.ArrayList;

public class PCTDao {
	Scanner sc = new Scanner(System.in);
	ArrayList<PCTData> list = new ArrayList<PCTData>();
	
	public void append() {
		PCTData data = new PCTData();
		
		System.out.print("�̸� : ");
		data.setName(sc.next());
		
		data.setWrite( getScore("�ʱ�", 400));	 // 0~400
		data.setWord( getScore("����", 200)); 	 // 0~200
		data.setSpread( getScore("��������", 200)); // 0~200
		data.setPpt( getScore("������Ʈ", 200)); 	 // 0~200
		
		data.calculate();
		
		list.add(data);
	}
	
	int getScore(String subject, int limit) {
		int temp;
		System.out.printf("%s : ", subject);
		temp = sc.nextInt();
		while(temp<0 || temp>limit) {
			System.out.printf("0~%d ������ ���� �Է��ϼ���\n", limit);
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
		System.out.println("      �޴�       ");
		System.out.println("----------------");
		System.out.println("    1. �Է�      ");
		System.out.println("    2. ���      ");
		System.out.println("    3. �˻�      ");
		System.out.println("    0. ����      ");
		System.out.println("--------------- ");
	}
	
	public void start2() {
		while(true) {
			menuDisplay();
			System.out.print("���� : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: append(); break;
			case 2: output(); break;
			case 3: System.out.println("�˻�"); break;
			case 0: System.out.println("���α׷��� �����մϴ�.");
				return;
			default: System.out.println("����");
			}
		}
	}
}
