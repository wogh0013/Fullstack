package w1130;
import java.util.ArrayList;

class Book {
	private String title;
	private String author;
	private int price;
	
	//������1
	public Book() {
		super();
	}
	
	//������2 : ������2�� ����� ���ؼ��� �⺻�������� ������1�� ���ǵ��־�� �Ѵ�. �׷��� ���� x
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override //����� ���� �Լ� ����
	public String toString() {
		return title + " " + author + " " + price;
	}
	//�ڹ��� ��� Ŭ������ Object��� Ŭ������ �ڼ��̴�. 
	//Object�κ��� ��ӹ��� toString �޼��带 �������̵��ϸ� �ȴ�.
	
	public Book copy() { // ���� ���縦 ���� Book�Լ� ī��
		Book temp = new Book(); //temp ��ü ����
		temp.title = this.title;
		temp.author = this.author;
		temp.price = this.price;
		
		return temp;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj; // ��������ȯ
		return this.title.equals(book.title) && this.author.equals(book.author) ;
	}
	
	//�����鿡 ������ �� �ִ� �Լ��� getter/setter��� �Ѵ�.
	public void setTitle(String title) { //Title������ �����ϴ� �Է��Լ���� ����
		this.title = title;
	}
	
	public String getTitle() { //Title������ �����ϴ� ����Լ���� ����
		return this.title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}

public class �÷���2{
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setTitle("�ְ�����");
		System.out.println(book.getTitle());
		book.setAuthor("�̼θ���");
		System.out.println(book.getAuthor());
		book.setPrice(15000);
		System.out.println(book.getPrice());
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("JAVA�� ����", "�迵��", 15000));
		
		//list ����������ϱ�
		for(Book b : list) {
			//System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPrice());
			//���� ��½��� �Լ��� ���� �����ϰ� !!
			System.out.println(b); 
			// �� System.out.println(b.toString());�� ������ ���̴�.
		}
		
		int pos = list.indexOf(new Book("JAVA�� ����", "�迵��", 15000));
		System.out.println(pos);
		
		
		//���������� ����� ���� �� ��
		book = new Book("���", "������", 10000);
		Book book2;
		
		//book�� ���� book2��
		//���������� ������ �� ������ �����Ѵ�. ���� ������ �����̶� book�ϰ� book2�����Ͱ� �Ȱ���
		book2 = book; //���� ����
		
//		//���� ���� -> Cloneble�̶�� �������̽� ����� �ؾ� �Ѵ�.
//		book2 = new Book();
//		book2.setTitle(book.getTitle());
//		book2.setAuthor(book.getAuthor());
//		book2.setPrice(book.getPrice()); // �� ����� ��ȿ����(�ڵ尡 �����)
		
		book2 = book.copy(); // ���� ����
		
		book.setTitle("������");
		
		System.out.println(book); //���� ������ ���� ���� ���´�.
		System.out.println(book2); //���� ������ �ٸ� ���� ���´�.
		
		//���� ���� �޸� ����(�ּ�)�� ���� �ִ��� Ȯ�� (but ������ �� ��)
		System.out.println(book == book2); //�������� - true, �������� - false
		
		String s1 = "school"; //��� ���ͷ� - ���� �޸�
		String s2 = "school"; //���ͷ��� �����ϴ� ��ġ�� �־ ���� �޸𸮿� ������
		
		String s3 = new String("school"); // heap������ ��ü�� ����� �ű⿡ school�� �ִ´�.
		String s4 = new String("school"); // heap������ ���� ����
		
		System.out.println(s1 == s2); // s1�� s2�� ���� �޸� ����
		System.out.println(s3 == s4); // s3�� s4�� �ٸ� �޸� ����(������)
		
		//������ ������ ��, ������������ equals �޼��带 ��� �Ѵ�
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4)); // ���� ������ ����?�� ����� ����
		
		book = new Book("�ڹ�������", "���ü�", 35000);
		book2 = new Book("�ڹ�������", "���ü�", 35000);
		
		System.out.println(book.equals(book2)); // �������̵带 ����� true�� ���´�.
	}
}
