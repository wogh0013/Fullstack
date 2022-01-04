package DoubleLinkedList;

public class MyQueue {
	Node head;
	Node tail;
	int count=0;
	
	public MyQueue()
	{
		init();
	}
	
	public void init()
	{
		head = new Node();
		tail = new Node();
		head.prev = head;
		head.next = tail;
		tail.prev = head;
		tail.next = tail;
	}
	
	public void put(int data)
	{
		Node temp = new Node();
		temp.data = data;
		
		// head -> "A" -> "B" -> "C" ->      -> tail
		//temp						 <- temp <-
		
		//prev 먼저 연결하기
		temp.prev = tail.prev;
		tail.prev = temp;
		
		temp.prev.next = temp;
		temp.next = tail;
		
		count++;
	}
	
	public void display()
	{
		Node trace = head.next;					//i=0;
		while(trace != tail)					//i<10;
		{
			System.out.print(trace.data);
			trace = trace.next;					//i++;
		}
	}
	
	public void reverseDisplay()
	{
		Node trace = tail.prev;					//i=9;
		while(trace != head)					//i>=0;
		{
			System.out.print(trace.data);
			trace = trace.prev;					//i--
		}
	}
	
	public int get()
	{
		int data = -1;
		if(head.next == tail)
			return data;
		
		//반환할 요소 : head.next.data
		data = head.next.data;
		Node del = head.next; //삭제될 대상
		head.next = del.next;
		head.next.prev = head;
		
		count--;
		return data;
	}
	
	//데이터 개수 반환하기
	public int getCount()
	{
		return count;
	}
	
	//큐가 비어있으면 true, 있으면 false 반환
	public boolean isEmpty()
	{
		if(head.next == tail)
			return true;
		else
			return false;
	}
	
	//최상위 데이터 반환
	public int peak()
	{
		if(isEmpty())
			return -1;
		
		return head.next.data;
	}
}
