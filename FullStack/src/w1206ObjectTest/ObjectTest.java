package w1206ObjectTest;

//
class Parent{
	protected int x;
	final void display() { // final : ���� - �޼ҵ�� �������̵� x, Ŭ������ ��� x
		System.out.println("x="+x);
	}
}

class Child extends Parent {
	int y;
//	void display() {     final�� ���Ƴ��Ƽ� ���Ұ�
//		System.out.println("y="+y);
//	}
}
public class ObjectTest {
	public static void main(String[] args) {
		
	}
}
