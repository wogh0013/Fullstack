package w1202상속;

import java.util.ArrayList;

//부모클래스 - 기본적으로 Object라는 클래스를 무조건 상속받는다.
class Cars{
	int speed;

	//생성자는 클래스 내부의 변수들을 초기화하기 위해 만든다.
	//사용자가 클래스를 정의만 하고 생성자를 안 만들면 시스템이 기본생성자를 만들어서 호출한다.
	//(모든 클래스는 반드시 생성자가 있다.
	public Cars() {
		//부모생성자 호출 - 부모가 Object라 Object 클래스의 생성자를 호출(하는 일은 x)
		super();
		System.out.println("parent default constructor");
	}
	
	//부모클래스의 생성자를 호출하는 경우는 부모클래스 생성자가 여러 개고 하는 일도 많아서, 그중에서 선택해서 호출하고자 할 때
	public Cars(int speed) {
		super();
		this.speed = speed;
		System.out.println("parent parameter constructor");
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//equals 함수는 Object 클래스가 정의한 함수이다.
	//객체 두 개의 값을 비교할 때 equals라는 함수를 사용해야 한다.
	//Object o1 = new Object();
	//Object o2 = new Object();
	//if (o1.equals(o2))
	
	//Car c1 = new Car(110);
	//Car c2 = new Car(130);
	//c1.equals(c2)
	
	@Override
	public boolean equals(Object obj) {
		//Car -> Object (업캐스팅)
		Cars temp = (Cars)obj; // Object -> Cars (다운캐스팅) - 예외적으로 허용된다.
		return this.speed == temp.speed;
	}
}

//자식클래스
class SportsCar extends Cars{
	boolean turbo; // 새로운 필드 추가하기
	
	//모든 생성자는 특별한 조건이 없으면, 부모의 기본생성자(매개변수 없는 생성자)를 호출한다.
	//자식생성자에서 부모생성자를 호출한다
	public SportsCar() {
		super(); //반드시 함수에서 첫 번째 라인에 생성한다.
		//부모클래스 생성자 중에 선택해서 호출한다. 디폴트생성자
		this.turbo=true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(speed); //부모생성자를 골라서 호출할 수 있다.
		//this.speed=speed;
		this.turbo=turbo;
		System.out.println("child parameter constructor");
	}
	
	public boolean isTurbo() {
		return turbo;
	}
	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
}

//부모클래스 : Cars
//자식클래스 : SportsCar
public class 상속 {
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.setSpeed(100);
		System.out.println(c1.getSpeed());
		
		SportsCar sc1 = new SportsCar();
		sc1.setSpeed(140);
		System.out.println(sc1.getSpeed());
		
		sc1.turbo=true;
		System.out.println(sc1.turbo);
		
		System.out.println("------------------------");
		SportsCar sc2 = new SportsCar(160, true);
		
		System.out.println("------------------------");
		
		//부모객체의 참조로 자식객체를 참조할 수 없다.
		
		c1 = sc1; //  Car <- SportsCar 객체를 저장함
		          // (자식이 부모의 형태로 전환된다. 업캐스팅(upcasting) - 항상 허용된다)
		
		//sc1 = new Cars(); //자식객체 참조로 부모객체 참조는 원친적으로 안됨
		//부모타입에서 자식타입으로 형전환하는 것을 다운캐스팅이라 하고, 허용이 안된다.
		//sc1 입장에서는 turbo변수가 있는데, Cars 객체는 turbo 변수가 없음.
		//부모클래스에서 파생되어 더 추가한 게 자식클래스니까 ㅇㅇ
		
		//upcasting(자식타입 -> 부모타입 변환) : 언제나 허용
		//downcasting(부모타입 -> 자식타입 변환) : 허용x, 예외적으로 허용(by 강제형변환)
		
		sc1 = (SportsCar)c1; //원래 SportsCar -> Cars -> SportsCar는 허용된다. (강제형전환)
		
		
		//제네릭 이전에, 밑과 같이 코딩을 했음 -> 불편 -> 제네릭의 필요성
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(new Cars(100)); //add함수 안에서는 Cars객체가 Object타입으로 변환돼서 들어간다. -> upcasting
		list.add(new Cars(110));
		list.add(new Cars(120));
		list.add(new Cars(130));
		list.add(new Cars(140));
		
//		list.add(7); // integer, string, sc1 모두 Object의 자식이므로 중구난방이 됨, Cars로 다운캐스팅해서 Cars클래스 자식만 담음.
//		list.add("flower");
//		list.add(new SportsCar(140, true));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getClass());
			
			//Cars temp = (Cars)list.get(i); // 다운캐스팅
			//System.out.println(temp.getSpeed());
		}
	}
}
