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
		
		//prev ���� �����ϱ�
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
		
		//��ȯ�� ��� : head.next.data
		data = head.next.data;
		Node del = head.next; //������ ���
		head.next = del.next;
		head.next.prev = head;
		
		count--;
		return data;
	}
	
	//������ ���� ��ȯ�ϱ�
	public int getCount()
	{
		return count;
	}
	
	//ť�� ��������� true, ������ false ��ȯ
	public boolean isEmpty()
	{
		if(head.next == tail)
			return true;
		else
			return false;
	}
	
	//�ֻ��� ������ ��ȯ
	public int peak()
	{
		if(isEmpty())
			return -1;
		
		return head.next.data;
	}
}
