package 재귀호출;

//재귀호출 
//- 함수가 자기 자신을 호출한다.
//- 자신을 끝없이 호출 가능 -> 종료 시점을 명시해야 함.
//- 속도가 느리다.
//- 스택공간에 함수에 대한 정보가 기술돼야 한다.
//- 재귀호출로 인해 코드가 간결해진다. (트리 순회 알고리즘, 퀵정렬)

class Recursive
{
	//1~10까지 재귀호출로
	void display(int limit)
	{
		if(limit==0) return;
		//함수를 호출할 때 값을 줄이거나 늘리거나
		//어느 시점에 도달하면 끝나도록

		System.out.println(limit);
		display(limit-1);
	}
	
	void display2(int limit)
	{
		if(limit==0) return;
		//함수를 호출할 때 값을 줄이거나 늘리거나
		//어느 시점에 도달하면 끝나도록

		display2(limit-1); // 아직 return이 안되고 붙잡혀있음
		System.out.println(limit);
	}
	
	// 팩토리얼 -> 5! = 5*4*3*2*1
	int factorial(int limit)
	{
		if(limit==1)
			return 1;
		else
			return limit * factorial(limit-1);
	}
}
public class 재귀호출 {
	public static void main(String[] args) {
		Recursive rs = new Recursive();
		rs.display(10); // 10 display(9), 9 display(8)
		rs.display2(10);
		System.out.println(rs.factorial(5));
	}
}
