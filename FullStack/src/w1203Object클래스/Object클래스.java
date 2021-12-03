package w1203ObjectŬ����;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//	-Clonable
class Score implements Cloneable {
	String name="";
	int kor;
	int eng;
	int total;
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d %d", name, kor, eng, total);
	}
	
	//equals�� �������̵�, hashCode�Լ��� �������̵� �ض�
	@Override
	public boolean equals(Object obj) {
		Score s = (Score)obj; //�ٿ�ĳ���� (�θ�Ŭ����->�ڽ�Ŭ������ ��ȯ)
		return this.name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}

class ScoreComparator implements Comparator<Score>{
	
	@Override
	public int compare(Score o1, Score o2) {
				//0���� ū ��
				//0
				//0���� ���� ��
		return -(o1.total - o2.total);
	}
}

public class ObjectŬ���� {
	public static void main(String[] args) {
		Object obj = new Object();
		
		//notify, notifyall, wait - ������
		
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());//�� ��ü�� ����ȭ���Ѽ� �� ��ü�� �ٸ��� �Ǵ� ��.

		List<Score> sList = new ArrayList<Score>();
		
		sList.add(new Score("ȫ�浿", 90, 80));
		sList.add(new Score("����", 100, 70));
		sList.add(new Score("�̱��", 85, 65));
		sList.add(new Score("�����", 100, 100));
		sList.add(new Score("�ڱ��", 95, 85));
		sList.add(new Score("�����", 80, 90));
		
		int pos = sList.indexOf(new Score("����", 0, 0));
		System.out.println(pos);
		
		//sort ������������
		for(Score s : sList)
			System.out.println(s);
		
		
	}
}
