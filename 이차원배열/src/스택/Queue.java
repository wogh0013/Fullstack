package 스택;

// rear ---------- front

public class Queue<T> {
	private T[] queue;
	private int rear;
	private int front;
	
	@SuppressWarnings("unchecked")
	public Queue()
	{
		queue = (T[])new Object[10];
		init();
	}
	
	@SuppressWarnings("unchecked")
	public Queue(int size)
	{
		if(size<10) 
			size=10;
		queue = (T[])new Object[size];
		init();
	}
	
	public void init()
	{
		rear=0;
		front=0;
	}
	
	public boolean isEmpty()
	{
		return front==rear;
	}
	
	public boolean isFull()
	{
		return ((rear+1)%queue.length)==front;
	}
	
	public void put(T data)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		
		rear = (rear+1)%queue.length;
		queue[rear]=data;
	}
	
	public T get()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return null;
		}
		
		front=(front+1)%queue.length;
		return queue[front];
	}
	
	public T peak()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return null;
		}
		
		return queue[(front+1)%queue.length];
	}
	
	public void display()
	{
		int i=front;
		while(i!=rear)
		{
			i++;
			System.out.println(queue[i] + " ");
			
			if(i==queue.length+1)
				i=0;
		}
		System.out.println();
	}
}




/*
 * 은행에 번호표 뽑기
 * 
 * 1. 손님
 * 2. 은행원
 * 
 * 1. 손님 선택: 손님의 대기번호는 현재 n번이며, 대기중인 사람은 n명입니다.
 * 2. 은행원 선택: n번 손님, 청구 앞으로 와주세요.
 * 
 * 시간은 한 명당 2분씩 계산 -> 대기 예정시간은 n분입니다.
 */
