package DoubleLinkedList;

public class DoubleLinkedList {
	Node head;
	Node tail;
	
	public DoubleLinkedList()
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
	
	public void insertTail(String data)
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
	
	public String deleteHead()
	{
		String data = "";
		if(head.next == tail)
			return data;
		
		//��ȯ�� ��� : head.next.data
		data = head.next.data;
		Node del = head.next; //������ ���
		head.next = del.next;
		head.next.prev = head;
		
		return data;
	}
}
