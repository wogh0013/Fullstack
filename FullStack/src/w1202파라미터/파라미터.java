package w1202파라미터;

// parameter, 인수, argument
// 메서드에 값을 전달할 목적으로 사용한다
// 값변수를 전달할 때와 참조변수 전달 시 다른 상황이 벌어진다

class MyType{
	int x;
	int y;
	
	//기본 생성자
	public MyType() {} // m1 = new MyType();
	
	// 매개변수 생성자
	public MyType(int x, int y) { // m2 = new MyType(10,20); 
		this.x = x;
		this.y = y;
	}
}

public class 파라미터 {

	//파라미터가 값 타입이다.
	void display(int x, int y) {
		// display.x = main.x
		// display.y = main.y
		// 메인함수에 있는 x, y값이 display값에 대입됨.
		System.out.printf("x=%d, y=%d\n", x, y);
	}
	
	void add(int x, int y) {
		// 함수에서의 인수는 값을 복사해 오는 것이지, 보내지는 않는다.
		x = x*2;
		y = y*2;
		
		// return 명령어는 값을 안 보내거나, 하나만 보낼 수 있다.
		// 그래서 이 경우는 return으로 값 반환 x
	}
	
	void add2(Integer x, Integer y) { //참조변수
		x = x*2;
		y = y*2;
	}
	
	public void add(MyType m) { //참조변수를 보내면
		//add.m = main.m1; -> 이 둘은 서로 같은 메모리
		m.x *= 2;
		m.y *= 2;
	}
	
	public static void main(String[] args) {
		int x=10, y=20; // main함수에 있는 지역변수
		파라미터 obj = new 파라미터();
		obj.add(x, y); // 10, 20이 출력됨
		obj.display(x, y); // x, y 변수의 값을 전달
		
		obj.add2(x, y); // 10, 20이 출력됨
		obj.display(x, y); // x, y 변수의 값을 전달
		
		MyType m2 = new MyType(10, 20);
		obj.add(m2);
		System.out.println(m2.x + "  " + m2.y);
	}
}
