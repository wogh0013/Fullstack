package w1130Q;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreDao {
	Scanner sc = new Scanner(System.in);
	ArrayList<ScoreData> list = new ArrayList<ScoreData>();
	String jungdap = "1234512345";
	
	public ScoreDao() {
		list.add(new ScoreData("ȫ�浿", "1234512345"));
		list.add(new ScoreData("�Ӳ���", "4154124232"));
		list.add(new ScoreData("������", "1523415124"));
		list.add(new ScoreData("������", "3245123451"));
		list.add(new ScoreData("�ֽ���", "1532124513"));
		
		//list.get(i).getAnswer().charAt(j) == jungdap.charAt(j);
	}
	
	public void process() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).calculate(jungdap);
		}
	}
	
	public void output() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void start() {
		process();
		output();
	}
}
