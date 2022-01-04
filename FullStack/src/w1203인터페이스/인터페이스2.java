package w1203인터페이스;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Book{
	String title="";
	String author="";
	int price=0;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d", title, author, price);
	}
}

class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.title.compareTo(o2.title);
	}
	
}




// Comparator - 별도로 만든다.
// Comparable - 직접 데이터 클래스에서 상속받는다.
public class 인터페이스2 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("그환자", "서은원", 15000));
		bookList.add(new Book("그XX", "권지용", 25000));
		bookList.add(new Book("노인과바다", "J.M콜먼", 18000));
		bookList.add(new Book("다잉아이", "히가시노",13000 ));
		bookList.add(new Book("나를버리다", "황선일", 21000));
		bookList.add(new Book("멈추지않는도전", "박지성", 14000));
		bookList.add(new Book("꽃다운나이", "꽃여정", 27000));
		bookList.add(new Book("공학이란?", "M.E웨이슨", 22000));
		bookList.add(new Book("바보처럼꿈꿔라", "반기문", 19000));
		bookList.add(new Book("나의사람아", "강하늘", 18000));
		
		bookList.sort(new BookComparator());
		
		for(Book book : bookList)
			System.out.println(book);
		
		
		//Iterator : 시스템 내부에서 실제 데이터들의 배치모습이나 순서와 상관없이 클래스 밖에서
		//			 내부 데이터를 순서대로 접근하도록 하는 인터페이스이다.
		//			 모든 컬렉션 클래스들은 이 인터페이스를 지원한다.
		//			 이 인터페이스를 지원하는 클래스들은 for each 구문 처리가 가능하다.
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) { //다음 요소로 이동 가능하면 true, 아니면 false 반환
			Book book = it.next(); //현재 객체를 반환하면서 다음번 데이터로 이동
			System.out.println(book);
		}
		
		//ArrayList는 get(0), get(1)... -> '키'를 써서 내용물로 데이터 검색
		//get("school"), get("rain")
		Map<String, String> map = new HashMap<String, String>();
		map.put("school", "학교");
		map.put("hospital", "병원");
		map.put("house", "집");
		map.put("company", "회사");
		map.put("assembly", "국회");
		map.put("president", "대통령");
		
		System.out.println(map.get("school"));
		System.out.println(map.get("hospital"));
		System.out.println(map.get("house"));
		System.out.println(map.get("company"));
		System.out.println(map.get("assembly"));
		System.out.println(map.get("president"));
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
