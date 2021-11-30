package w1130;
import java.util.ArrayList;

class Book {
	private String title;
	private String author;
	private int price;
	
	//생성자1
	public Book() {
		super();
	}
	
	//생성자2 : 생성자2를 만들기 위해서는 기본생성자인 생성자1이 정의돼있어야 한다. 그래야 오류 x
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override //출력을 위한 함수 생성
	public String toString() {
		return title + " " + author + " " + price;
	}
	//자바의 모든 클래스는 Object라는 클래스의 자손이다. 
	//Object로부터 상속받은 toString 메서드를 오버라이딩하면 된다.
	
	public Book copy() { // 깊은 복사를 위한 Book함수 카피
		Book temp = new Book(); //temp 객체 생성
		temp.title = this.title;
		temp.author = this.author;
		temp.price = this.price;
		
		return temp;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj; // 강제형변환
		return this.title.equals(book.title) && this.author.equals(book.author) ;
	}
	
	//변수들에 접근할 수 있는 함수를 getter/setter라고 한다.
	public void setTitle(String title) { //Title변수에 접근하는 입력함수라고 생각
		this.title = title;
	}
	
	public String getTitle() { //Title변수에 접근하는 출력함수라고 생각
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

public class 컬렉션2{
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setTitle("쌍감포차");
		System.out.println(book.getTitle());
		book.setAuthor("미셰르쉴");
		System.out.println(book.getAuthor());
		book.setPrice(15000);
		System.out.println(book.getPrice());
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("JAVA의 정석", "김영한", 15000));
		
		//list 데이터출력하기
		for(Book b : list) {
			//System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPrice());
			//위의 출력식을 함수를 통해 간단하게 !!
			System.out.println(b); 
			// └ System.out.println(b.toString());과 동일한 식이다.
		}
		
		int pos = list.indexOf(new Book("JAVA의 정석", "김영한", 15000));
		System.out.println(pos);
		
		
		//참조변수의 복사와 둘의 값 비교
		book = new Book("고수", "문정후", 10000);
		Book book2;
		
		//book의 값을 book2로
		//참조변수를 복사할 때 참조를 복사한다. 같은 데이터 공간이라 book하고 book2데이터가 똑같다
		book2 = book; //얕은 복사
		
//		//깊은 복사 -> Cloneble이라는 인터페이스 상속을 해야 한다.
//		book2 = new Book();
//		book2.setTitle(book.getTitle());
//		book2.setAuthor(book.getAuthor());
//		book2.setPrice(book.getPrice()); // 이 방법은 비효율적(코드가 길어짐)
		
		book2 = book.copy(); // 깊은 복사
		
		book.setTitle("용비불패");
		
		System.out.println(book); //얕은 복사라면 같은 값이 나온다.
		System.out.println(book2); //깊은 복사라면 다른 값이 나온다.
		
		//둘이 같은 메모리 공간(주소)을 갖고 있는지 확인 (but 내용은 안 봄)
		System.out.println(book == book2); //얕은복사 - true, 깊은복사 - false
		
		String s1 = "school"; //상수 리터럴 - 같은 메모리
		String s2 = "school"; //리터럴만 저장하는 위치가 있어서 같은 메모리에 공유됨
		
		String s3 = new String("school"); // heap공간에 객체를 만들고 거기에 school을 넣는다.
		String s4 = new String("school"); // heap공간에 따로 만듦
		
		System.out.println(s1 == s2); // s1과 s2는 같은 메모리 공간
		System.out.println(s3 == s4); // s3과 s4는 다른 메모리 공간(참조라서)
		
		//내용이 같은지 비교, 참조형변수는 equals 메서드를 써야 한다
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4)); // 둘의 내용이 같냐?를 물어보는 거임
		
		book = new Book("자바의정석", "남궁성", 35000);
		book2 = new Book("자바의정석", "남궁성", 35000);
		
		System.out.println(book.equals(book2)); // 오버라이드를 해줘야 true가 나온다.
	}
}
