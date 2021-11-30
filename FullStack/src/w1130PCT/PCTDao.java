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
		
		System.out.print("�ʱ� : "); // 0~400
		data.setWrite(sc.nextInt());
		
		System.out.print("���� : "); // 0~200
		data.setWord(sc.nextInt());
		
		System.out.print("�������� : "); // 0~200
		data.setSpread(sc.nextInt());
		
		System.out.print("������Ʈ : "); // 0~200
		data.setPpt(sc.nextInt());
		
		data.calculate();
		
		list.add(data);
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
}
