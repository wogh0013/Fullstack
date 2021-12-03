package w1203�������̽�;
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




// Comparator - ������ �����.
// Comparable - ���� ������ Ŭ�������� ��ӹ޴´�.
public class �������̽�2 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("��ȯ��", "������", 15000));
		bookList.add(new Book("��XX", "������", 25000));
		bookList.add(new Book("���ΰ��ٴ�", "J.M�ݸ�", 18000));
		bookList.add(new Book("���׾���", "�����ó�",13000 ));
		bookList.add(new Book("����������", "Ȳ����", 21000));
		bookList.add(new Book("�������ʴµ���", "������", 14000));
		bookList.add(new Book("�ɴٿ��", "�ɿ���", 27000));
		bookList.add(new Book("�����̶�?", "M.E���̽�", 22000));
		bookList.add(new Book("�ٺ�ó���޲��", "�ݱ⹮", 19000));
		bookList.add(new Book("���ǻ����", "���ϴ�", 18000));
		
		bookList.sort(new BookComparator());
		
		for(Book book : bookList)
			System.out.println(book);
		
		
		//Iterator : �ý��� ���ο��� ���� �����͵��� ��ġ����̳� ������ ������� Ŭ���� �ۿ���
		//			 ���� �����͸� ������� �����ϵ��� �ϴ� �������̽��̴�.
		//			 ��� �÷��� Ŭ�������� �� �������̽��� �����Ѵ�.
		//			 �� �������̽��� �����ϴ� Ŭ�������� for each ���� ó���� �����ϴ�.
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) { //���� ��ҷ� �̵� �����ϸ� true, �ƴϸ� false ��ȯ
			Book book = it.next(); //���� ��ü�� ��ȯ�ϸ鼭 ������ �����ͷ� �̵�
			System.out.println(book);
		}
		
		//ArrayList�� get(0), get(1)... -> 'Ű'�� �Ἥ ���빰�� ������ �˻�
		//get("school"), get("rain")
		Map<String, String> map = new HashMap<String, String>();
		map.put("school", "�б�");
		map.put("hospital", "����");
		map.put("house", "��");
		map.put("company", "ȸ��");
		map.put("assembly", "��ȸ");
		map.put("president", "�����");
		
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
