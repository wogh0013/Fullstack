package w1129;

class Person{ // 클래스명 첫 글자는 대문자 !
	String name; //멤버변수 필드 속성
	String phone;
	String address;
	int age; //변수 추가하기
	
	//생성자 - 메서드의 일종, 객체를 만들 때 자동으로 호출
	//이 메서드는 이름이 정해져있다. 클래스명과 동일해야 함.
	//생성자는 접근권한이 public이어야 함
	//변수들한테 시작할 때 오류 안 나게 기본이 될 값을 넣어주거나 기타 등등 준비작업을 할 수 있음
	//생성자는 반황형 못 씀
	//생성자는 여러 개 생성 가능 (자바가 overloading 기능이 있어, 함수명은 같은데 형태가 다른 함수 여러 개 생성 가능)
	public Person() { // Person ○○ = new Person(); 할 때마다 생성자가 호출이 됨
		name = "";
		phone = "";
		address = "";
		age = 20;
		System.out.println("생성자가 호출되었음");
	}
	
	public Person(String name, int age, String phone, String address) {
		
		//매개변수 name과 클래스변수 name을 구분을 못한다.
		//this - 참조자, 내 거, 변수만 그냥 써도 this 참조자가 있는 거로 안다.
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		System.out.println("매개변수가 있는 생성자가 호출되었음");
	}
	
	//함수를 만들다, 메서드, 동작
	void setPerson(String n, String p, String a) {
		name = n;
		phone = p;
		address = a;
	}
	
	void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}
}


public class OOP1 {
	public static void main(String[] args) {
		//1.객체 생성하기
		Person p1; //객체 참조변수 선언, null 또는 new 클래스명()으로 초기화 가능
		p1 = new Person(); // heap공간에 객체를 만들고 객체의 주소를 전달
						   // 만일 객체를 만들 공간이 없을 경우에 null값을 줌
		p1.name = "정재호";
		p1.phone = "010-1234-5678";
		p1.address = "인천시 남동구";
		
		System.out.println(p1.name);
		System.out.println(p1.phone);
		System.out.println(p1.address);
		
		//배열 - 참조, 객체 - 참조
		//객체배열 - 참조의 참조
		Person[] persons = new Person[3]; //객체 3개 담을 배열만 작성
		persons[0] = new Person(); //객체따로
		persons[0].name = "홍길동";
		persons[0].phone = "010-0000-0000";
		persons[0].address = "서울시 서초구";
		
		System.out.println(persons[0].name);
		System.out.println(persons[0].phone);
		System.out.println(persons[0].address);
		
		persons[1] = new Person();
		persons[1].setPerson("박상태", "010-5678-1234", "송파구");
		persons[1].output();
		
		//클래스를 남이 만든 걸 가져다 쓰려 한다.
		persons[2] = new Person("jaeho", 26, "010-9756-1474", "검암");
		persons[2].output();
		
	}
}
