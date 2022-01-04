package w1129;

//클래스 안의 메서드들은 객체를 안 만들면 실체가 없어서 호출이 안됨
public class MethodTest1 {
	
	//displayLine이라는 메서드 정의
	public void displayLine() {
		System.out.println("=======");
		}
	
	public void displayLine2(int line) {
		for(int i=1; i<=line; i++) {
			System.out.println("-------");
		}
	}
	
	//라인숫자, 개수, 문자를 지정 -> 매개변수
	//매개변수 : 매개체가 되는 변수들
	//함수 외부로부터 함수에 값을 전달할 목적으로 사용하는 변수들이다.
	//displayLine3(3, 10, '*')
	public void displayLine3(int line, int cnt, char mark) {
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=cnt; j++) 
				System.out.print(mark);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//displayLine(); //이것만 딸랑 있으면 당연히 호출이 안됨.
		
		//클래스 안의 메서드 -> 객체를 만들어줘야 실체가 생김 -> 메서드 호출 가능
		MethodTest1 t1 = new MethodTest1(); 
		t1.displayLine(); //함수의 호출
		
		t1.displayLine();
		t1.displayLine(); // 메서드값만 바꾸면 모든 호출값이 바뀜 good
		t1.displayLine(); // 메서드의 장점 : 재사용성 !!!
		System.out.println();
		
		t1.displayLine2(3);
		System.out.println();
		
		t1.displayLine3(3, 10, '*');
		t1.displayLine3(2, 5, '%');
	}
}
