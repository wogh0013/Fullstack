package com.woori.myapp;

// ��ũ�� ����Ʈ (Linked List)

public class MyList {
	Node head = null; //null �����Ͱ� �� �ǵ� ���� ��, �� �տ� �������� ��, �߰��� �������� ��
	Node tail = null;
	
	public MyList()
	{
		init();
	}
	
	public void init()
	{
		head = new Node();
		tail = new Node();
		
		head.next = tail;
		tail.next = tail;
		
		//�׻� �߰��� �����ֱ�
	}
	
	public void insertHead(String data)
	{
		//�׻� head�ʿ� �����͸� �ֱ� - ���ñ���
		Node temp = new Node();
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
		Node trace;
		trace = head.next;
		while(trace != tail)
		{
			System.out.print(trace.data + " ");
			trace = trace.next;
		}
	}
	
	public void insertTail(String data)
	{
		//�׻� head�ʿ� �����͸� �ֱ� - ���ñ���
		Node temp = new Node();
		temp.data = data;
		
		//tail �ձ��� ������ ����
		
		Node trace1 = head.next;
		Node trace2 = head.next;
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
	
	public String find(String data)
	{
		//data�� ã�Ƽ� ������ 'ã�Ҵ�'�� ��ȯ, ������ '�� ã�Ҵ�'�� ��ȯ
		Node trace = head.next;
		boolean flag = false;
		
		while(!flag && trace != tail)
		{
			if(trace.data.equals(data))
				flag = true;
			else
				trace = trace.next;
		}
		
		if(flag)
			return "ã�Ҵ�.";
		else
			return "�� ã�Ҵ�.";
	}
	
	public void orderedInsert(String data)
	{
		// 1. ��� �����, ������ �ְ�
		Node temp = new Node();
		temp.data = data;
		
		//�ڱ� ��ġ���� ã�ư���. ������ �� �ڿ� �ִ� ��Ҹ� ���� or tail�� ����.
		//�� ���� �� ��Ҵ� �ƴµ�, �� ���� ��Ҹ� �𸥴�.
		// �� �׻� ������ Node�� �� ������ �Ѵ�.
		
		Node trace2 = head;
		Node trace1 = head.next;
		while(trace1.data.compareTo(data)<=0 && trace1!=tail)
		{
			trace2 = trace2.next;
			trace1 = trace1.next;
		}
		
		temp.next = trace1;
		trace2.next = temp;
	}
	
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
		
		Node trace2 = head;
		Node trace1 = head.next;
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
		
		Node trace2 = head;
		Node trace1 = head.next;
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










