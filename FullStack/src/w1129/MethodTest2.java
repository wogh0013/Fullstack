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
	
	void displayGugu(int dan) {
		for(int i=1; i<=9; i++) {
			int result = dan*i;
				System.out.println(dan + "*" + i + " = " + result);
		}
	}
	
	int sigma(int limit) {
		int i, sum=0; // 함수 안에 변수를 만들면 함수 안에서만 존재 (지역변수)
		for(i=1; i<=limit; i++) {
			sum += i; // sum = sum + i
		}
		return sum;
	}
	
	//연도를 입력받아서 윤년이면 true, 아니면 false를 반환하는 함수 만들기
	//4의 배수이면서 100의 배수가 되면 안된다, 그리고 400의 배수는 윤년이다  isLeap(2000);
	boolean isLeap(int year) {
		//순서 : not -> and -> or
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		else 
			return false;
	}
	
	void diamondDisplay(int line) {
		//1.만약에 line이 짝수면 홀수로 바꿔서
		
		if(line%2==0) // 짝수일 때 홀수로 만들고
			line = line+1;
		
		line = line/2+1; // 9/2 -> 4 -> +1 = 5
		
		System.out.println(line);
		
		int i, j;
		for(i=1; i<=line; i++) {
			for(j=1; j<=line-i; j++)
				System.out.print(" ");
			for(j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=1; i<=line-1; i++) {
			for(j=1; j<=i; j++)
				System.out.print(" ");
			for(j=1; j<=2*(line-i)-1; j++)
				System.out.print("*");
			System.out.println();
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
		
		//1~n까지의 합계를 구해서 반환하는 함수
		System.out.println(mm.sigma(10));
	
		int cnt=0;
		for(int i=0; i<=2021; i++) {
			if(mm.isLeap(i))
				cnt++;
		}
		System.out.println(cnt);
		
		mm.diamondDisplay(9);
	}
}
