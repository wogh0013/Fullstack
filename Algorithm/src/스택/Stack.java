package 스택;

//객체지향 프로그래밍에서 설명하는 클래스 만들기에 적합함
//스택은 push() 스택에 데이터를 하나 넣는다
//		pop()  스택의 맨 위에서 데이터 하나를 꺼내서 반환한다.
//		isEmpty() 스택이 비면 true, 아니면 false 반환
//		isFull() 스택이 꽉 차면 true, 아니면 false를 반환
//		peak() 스택의 최상위 데이터를 확인
public class Stack<T> {
	private T stack[];
	private int top; //배열의 인덱스 - 스택의 최상위를 가리켜야 한다.
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		stack = (T[])new Object[10];
		top=-1; // 스택이 비어있는 상황
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
		if(size<10)
			size=10;
		stack = (T[])new Object[size];
		top=-1; //스택이 비어있는 상황
	}
	
	public void push(T a)
	{
		if(isFull()) { // 에러처리를 위쪽에서 하면 함수가 깔끔해짐
			System.out.println("Stack Overflow");
			return;	   // 함수를 종료한다. void일 때는 return;
		}
		top++;
		stack[top]=a;
	}
	
	public T pop()
	{
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null; // 함수가 return을 해야 하는데 보낼 값이 없을 때는
					   // -1을 보내는 게 일반적이다.
					   // 위처럼 void일 때는 그냥 return
					   // 하지만 여기선 int형 반환이므로 -1을 return해버린다.
		}
		T temp = stack[top]; // 최상위 데이터를 가져옴
		top--; // 하나 지우는 동작
		return temp;
	}
	
	boolean isFull()
	{
		if(top==stack.length-1) 
			return true;
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	//스택 쓰다가 스택의 정보를 초기화
	public void init()
	{
		top=-1;
	}
	
	public T peak()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return null;
		}
		
		T temp = stack[top]; // 최상위 데이터를 가져옴 - 삭제 전의 최상위 데이터 확인
		top--;
		return null;
	}
}
