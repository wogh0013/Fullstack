package w1206�÷���Ŭ����;

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

public class �÷���Ŭ���� {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("�������ǵ�","���طѸ�","���а�����",10000));
		bookList.add(new Book("�����","�����㺣��","â�۰�����",10000));
		bookList.add(new Book("ī��������","����Ʈ","����������",10000));
		bookList.add(new Book("��Ȱ","��������","�ϴ�",10000));
		bookList.add(new Book("Ź��","ä����","�麣��",10000));
		
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i).toString());
		}
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//���� ���� ��ü�� ��ȯ�ϸ� �������� �̵�
		}
		
		
		
		List<Book> programList = new ArrayList<Book>();
		bookList.add(new Book("�ڹ�","���ü�","��������",32000));
		bookList.add(new Book("���̽�","������","�Ѻ�",18000));
		bookList.add(new Book("�ӽŷ���","������","������",30000));
		bookList.add(new Book("������","�輺��","�������Ͻ�",33000));
		bookList.add(new Book("JSP","�����","�������ۺ���",12000));
		
		for(Book book : programList) {
			System.out.println(book);
		}
		
		//������ �� �� Vector�� ���� (ArrayList���� Vector !!)
		List<Book> bList = new Vector<Book>();
		for(int i=1; i<=5; i++) {
			bList.add(new Book("å"+i, "�۰�"+i, "���ǻ�"+i, 20000));
		}
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()); // ������ �ϳ��� ����
		}
		
		
		//First In First Out
		//Map �߻�Ŭ����
		
		Map<String, Book> bookMap = new HashMap<String, Book>();
		bookMap.put("program1", new Book("java", "���ü�", "��������", 20000));
		bookMap.put("program2", new Book("python", "������", "������", 30000));
		bookMap.put("program3", new Book("C#", "�����", "�Ѻ��̵��", 40000));
		
		System.out.println(bookMap.get("program1"));
		System.out.println(bookMap.get("program2"));
		System.out.println(bookMap.get("program3"));
		
		for(String key : bookMap.keySet()) {
			System.out.println(key + " " + bookMap.get(key));
		}
		
		//Dto�� �� ����� Map�� �̿� -> ���� ���
		List<HashMap<String, String>> personList = new ArrayList<HashMap<String, String>>();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "ȫ�浿");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		map = new HashMap<String, String>();
		map.put("name", "�Ӳ���");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		map = new HashMap<String, String>();
		map.put("name", "����");
		map.put("phone", "010-0000-0000");
		personList.add(map);
		
		
		for(int i=0; i<personList.size(); i++) {
			HashMap<String, String>temp = personList.get(i);
			System.out.printf("%s %s\n", temp.get("name"), temp.get("phone"));
		}
	}
}
