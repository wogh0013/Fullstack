package w1129;

class MyMethod{
	
	//함수가 두 개의 정수를 입력받아서 결과를 반환하는 함수
	//함수명 앞에 void를 제외한 다른 타입을 넣으면, 반드시 return 구문을 작성해야 한다.
	int add(int x, int y) {
		return x+y;
	}
	
	void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	void displayGugu(int x) {
		for(int i=1; i<=9; i++) {
			int result = x*i;
				System.out.println(x + "*" + i + " = " + result);
		}
	}
}


public class MethodTest2 {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		int a = mm.add(3, 5);
		System.out.println(a);
		
		//System.out.println(mm.sub(1,5)); void를 출력 못한다.
		mm.sub(5, 3);
		
		mm.displayGugu(4);
	
	}
}
