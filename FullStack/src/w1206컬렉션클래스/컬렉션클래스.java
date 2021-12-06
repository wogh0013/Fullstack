package w1206컬렉션클래스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

class Book{
	String title;
	String author;
	String publisher;
	int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book(String title, String author, String publisher, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public Book() {
		super();
		this.title="";
		this.author="";
		this.publisher="";
		this.price=0;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d", title, author, publisher, price);
	}
	
}

public class 컬렉션클래스 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("마법사의돌","조앤롤링","문학과지성",10000));
		bookList.add(new Book("어린왕자","생텍쥐베리","창작과비평",10000));
		bookList.add(new Book("카르마조프","도스트","지성과비평",10000));
		bookList.add(new Book("부활","폴스토이","하늘",10000));
		bookList.add(new Book("탁류","채만식","들베개",10000));
		
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i).toString());
		}
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//지금 현재 객체를 반환하면 다음으로 이동
		}
		
		
		
		List<Book> programList = new ArrayList<Book>();
		bookList.add(new Book("자바","남궁성","도우출판",32000));
		bookList.add(new Book("파이썬","김정하","한빛",18000));
		bookList.add(new Book("머신러닝","김정현","에이콘",30000));
		bookList.add(new Book("딥러닝","김성훈","남가락북스",33000));
		bookList.add(new Book("JSP","김계희","이지스퍼블리싱",12000));
		
		for(Book book : programList) {
			System.out.println(book);
		}
		
		//쓰레드 쓸 때 Vector가 좋다 (ArrayList보다 Vector !!)
		List<Book> bList = new Vector<Book>();
		for(int i=1; i<=5; i++) {
			bList.add(new Book("책"+i, "작가"+i, "출판사"+i, 20000));
		}
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()); // 데이터 하나씩 제거
		}
		
		
		//First In First Out
		//Map 추상클래스
		
		Map<String, Book> bookMap = new HashMap<String, Book>();
		bookMap.put("program1", new Book("java", "남궁성", "도우출판", 20000));
		bookMap.put("program2", new Book("python", "김정현", "에이콘", 30000));
		bookMap.put("program3", new Book("C#", "김계희", "한빛미디어", 40000));
		
		System.out.println(bookMap.get("program1"));
		System.out.println(bookMap.get("program2"));
		System.out.println(bookMap.get("program3"));
		
		for(String key : bookMap.keySet()) {
			System.out.println(key + " " + bookMap.get(key));
		}
		
		//Dto를 안 만들고 Map을 이용 -> 옛날 방식
		List<HashMap<String, String>> personList = new ArrayList<HashMap<String, String>>();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		map = new HashMap<String, String>();
		map.put("name", "임꺽정");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		map = new HashMap<String, String>();
		map.put("name", "장길산");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		
		for(int i=0; i<personList.size(); i++) {
			HashMap<String, String>temp = personList.get(i);
			System.out.printf("%s %s\n", temp.get("name"), temp.get("phone"));
		}
	}
}
