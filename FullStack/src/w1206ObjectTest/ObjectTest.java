package w1206ObjectTest;

//
class Parent{
	protected int x;
	final void display() { // final : 봉인 - 메소드는 오버라이딩 x, 클래스는 상속 x
		System.out.println("x="+x);
	}
}

class Child extends Parent {
	int y;
//	void display() {     final로 막아놓아서 사용불가
//		System.out.println("y="+y);
//	}
}
public class ObjectTest {
	public static void main(String[] args) {
		
	}
}
