package com.woori.myapp2;

// ��ũ�� ����Ʈ (Linked List)

public class MyList2<T> {
	Node2<T> head = null; //null �����Ͱ� �� �ǵ� ���� ��, �� �տ� �������� ��, �߰��� �������� ��
	Node2<T> tail = null;
	
	public MyList2()
	{
		init();
	}
	
	public void init()
	{
		head = new Node2<T>();
		tail = new Node2<T>();
		
		head.next = tail;
		tail.next = tail;
		
		//�׻� �߰��� �����ֱ�
	}
	
	public void insertHead(T data)
	{
		//�׻� head�ʿ� �����͸� �ֱ� - ���ñ���
		Node2<T> temp = new Node2<T>();
		temp.data = data;
		
		// head -> (|) -> (|) -> tail
		//			  (|) temp
		
		//���� �߿� - ���� �ٲ�� �ȵȴ�.
		temp.next = head.next;
		head.next = temp;
	}
	
	public void display()
	{
		//������ ��ũ
		Node2<T> trace=null;
		trace = head.next;
		while(trace != tail)
		{
			System.out.print(trace.data + " ");
			trace = trace.next;
		}
	}
	
	public void insertTail(T data)
	{
		//�׻� head�ʿ� �����͸� �ֱ� - ���ñ���
		Node2<T> temp = new Node2<T>();
		temp.data = data;
		
		//tail �ձ��� ������ ����
		
		Node2<T> trace1 = head.next;
		Node2<T> trace2 = head.next;
		while(trace1 != tail)
		{
			trace1 = trace1.next;
			trace2 = trace2.next;
		}
		
		// head -> () ->
		//���� ��ũ�帮��Ʈ�� ����
		// �� �ڱ� ���� ���� ���� �Ұ���
		// �� �׷��� tail ���� ��Ҵ� ������ ������ �� ���� ����ٳ�� �Ѵ�.
		// �� trace1 �� trace2 ���̿� �����־�� �Ѵ�.
		
		trace2.next = temp;
		temp.next = tail;
	}
	
	public T find(T data)
	{
		//data�� ã�Ƽ� ������ 'ã�Ҵ�'�� ��ȯ, ������ '�� ã�Ҵ�'�� ��ȯ
		Node2<T> trace = head.next;
		boolean flag = false;
		
		while(!flag && trace != tail)
		{
			if(trace.data.equals(data))
				flag = true;
			else
				trace = trace.next;
		}
		
		if(flag)
			return trace.data;
		else
			return null;
	}
	
//	public void orderedInsert(T data)
//	{
//		// 1. ��� �����, ������ �ְ�
//		Node2<T> temp = new Node2<T>();
//		temp.data = data;
//		
//		//�ڱ� ��ġ���� ã�ư���. ������ �� �ڿ� �ִ� ��Ҹ� ���� or tail�� ����.
//		//�� ���� �� ��Ҵ� �ƴµ�, �� ���� ��Ҹ� �𸥴�.
//		// �� �׻� ������ Node�� �� ������ �Ѵ�.
//		
//		Node2<T> trace2 = head;
//		Node2<T> trace1 = head.next;
//		
//		while(trace1.data.compareTo(data)<=0 && trace1!=tail)
//		{
//			trace2 = trace2.next;
//			trace1 = trace1.next;
//		}
//		
//		temp.next = trace1;
//		trace2.next = temp;
//	}
	
	//head�� ����
	public void deleteHead()
	{
		if(head.next == tail) //�Լ� ���� �� ����ó���� ���� �Ѵ٤�.
			return;
		
		head.next = head.next.next;
	}
	
	//��ü����
	public void deleteAll()
	{
		head.next = tail;
	}
	
	//tail�� ����
	public void deleteTail()
	{
		if(head.next == tail)
			return;
		
		Node2<T> trace2 = head;
		Node2<T> trace1 = head.next;
		while(trace1.next != tail)
		{
			trace1 = trace1.next;
			trace2 = trace2.next;
		}
		
		trace2.next = tail;
		
	}
	
	//�׸� ã�Ƽ� ����
	public void deleteItem(String data)
	{
		if(head.next == tail)
			return;
		
		Node2<T> trace2 = head;
		Node2<T> trace1 = head.next;
		boolean flag = false;
		
		while(!flag && trace1 != tail)
		{
			if(trace1.data.equals(data))
				flag = true;
			else
			{
				trace1 = trace1.next;
				trace2 = trace2.next;
			}
		}
		
		if(flag)
			trace2.next = trace1.next;
	}
}










