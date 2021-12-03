package w1203Object클래스;

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
	
	//equals를 오버라이딩, hashCode함수도 오버라이딩 해라
	@Override
	public boolean equals(Object obj) {
		Score s = (Score)obj; //다운캐스팅 (부모클래스->자식클래스로 변환)
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
				//0보다 큰 값
				//0
				//0보다 작은 값
		return -(o1.total - o2.total);
	}
}

public class Object클래스 {
	public static void main(String[] args) {
		Object obj = new Object();
		
		//notify, notifyall, wait - 스레드
		
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());//각 객체를 숫자화시켜서 각 객체가 다르게 되는 것.

		List<Score> sList = new ArrayList<Score>();
		
		sList.add(new Score("홍길동", 90, 80));
		sList.add(new Score("김기사", 100, 70));
		sList.add(new Score("이기사", 85, 65));
		sList.add(new Score("정기사", 100, 100));
		sList.add(new Score("박기사", 95, 85));
		sList.add(new Score("서기사", 80, 90));
		
		int pos = sList.indexOf(new Score("김기사", 0, 0));
		System.out.println(pos);
		
		//sort 총점기준으로
		for(Score s : sList)
			System.out.println(s);
		
		
	}
}
