package w1203추상클래스;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("rawtypes")
//Comparable - 인터페이스, 추상클래스가 극도로 추상화되면
class Person implements Comparable {
	String name;
	String phone;
	String address;
	
	public Person(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public int compareTo(Object o) {
		Person temp = (Person)o;
		//this.name이 사전순서상 temp.name보다 앞에 있으면 -값
		//this.name이 사전순서상 temp.name보다 앞에 있으면 0
		//this.name이 사전순서상 temp.name보다 앞에 있으면 +값
		
		return this.name.compareTo(temp.name);
	}
	
}

public class 추상클래스 {
	public static void main(String[] args) {
		//LinkedList - 내부 메커니즘으로 볼 때 중간에 추가삭제 시 ArrayList보다 빠르다.
		List<String> list = new LinkedList<String>();
		list.add("빼빼로");
		list.add("에이스");
		list.add("홈런볼");
		list.add("포카칩");
		list.add("새우깡");
		list.add("맛동산");
		list.add("감자깡");
		list.add("스윙칩");
		list.add("자갈치");
		
		list.sort(null); // 데이터 순서를 늘여놓음
		
		for(String s : list)
			System.out.println(s);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", "010-0000-0000", "봉천1동"));
		personList.add(new Person("임꺽정", "010-0000-0000", "봉천2동"));
		personList.add(new Person("장길산", "010-0000-0000", "봉천3동"));
		personList.add(new Person("김좌진", "010-0000-0000", "봉천4동"));
		personList.add(new Person("이순신", "010-0000-0000", "봉천5동"));
		personList.add(new Person("강감찬", "010-0000-0000", "봉천6동"));
		personList.add(new Person("서휘", "010-0000-0000", "봉천7동"));
		personList.add(new Person("을지문덕", "010-0000-0000", "봉천8동"));
		personList.add(new Person("김종서", "010-0000-0000", "봉천9동"));
		personList.add(new Person("최치원", "010-0000-0000", "봉천10동"));
		
		personList.sort(null);
		
		for(Person s : personList)
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
	}
}
