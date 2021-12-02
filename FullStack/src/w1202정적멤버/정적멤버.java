package w1202정적멤버;

class Counter{
	int x=0; //인스턴스 변수, 객체를 만들 때 메모리가 확보된다.(힙공간)
	
	static int count=0; //정적 변수, 클래스를 정의할 때 메모리가 확보된다.(정적공간)
						//공유메모리로 사용하고, 객체를 만들던 말던 난 이미 존재한다. 
						//생성자에서 값을 초기화하면 xxxxx !! 
						//객체가 없어도 접근 가능(객체 간에 공유한다)
						//	└(권장) 클래스.변수명 -> Counter.count
		// static 메서드는 static이 붙지 않은 변수나 함수는 사용할 수 없다.
		// 인스턴스 변수 사용불가, 인스턴스 함수 호출불가
		// this 참조자를 사용할 수 없다. this는 객체를 만들어야 사용 가능하다.
	
	public static void displayCount() {
		//System.out.println(x); // 인스턴스 변수 x는 객체가 있어야 사용 가능
		System.out.println("현재 카운트 : " + count); // 정적변수 count는 객체가 없어도 사용 가능
	}
}

public class 정적멤버 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		System.out.println(c1.x);
		System.out.println(c1.count);
		
		System.out.println(Counter.count); //정적변수는 클래스명으로 접근하는 것을 권장
	}
}
