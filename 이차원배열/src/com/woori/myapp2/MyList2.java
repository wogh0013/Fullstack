package com.woori.myapp2;

// 링크드 리스트 (Linked List)

public class MyList2<T> {
	Node2<T> head = null; //null 데이터가 한 건도 없을 때, 맨 앞에 끼워넣을 때, 중간에 끼워넣을 때
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
		
		//항상 중간에 끼워넣기
	}
	
	public void insertHead(T data)
	{
		//항상 head쪽에 데이터를 넣기 - 스택구조
		Node2<T> temp = new Node2<T>();
		temp.data = data;
		
		// head -> (|) -> (|) -> tail
		//			  (|) temp
		
		//순서 중요 - 절대 바뀌면 안된다.
		temp.next = head.next;
		head.next = temp;
	}
	
	public void display()
	{
		//추적용 링크
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
		//항상 head쪽에 데이터를 넣기 - 스택구조
		Node2<T> temp = new Node2<T>();
		temp.data = data;
		
		//tail 앞까지 추적해 들어가자
		
		Node2<T> trace1 = head.next;
		Node2<T> trace2 = head.next;
		while(trace1 != tail)
		{
			trace1 = trace1.next;
			trace2 = trace2.next;
		}
		
		// head -> () ->
		//단일 링크드리스트의 단점
		// └ 자기 앞의 노드는 추적 불가능
		// └ 그래서 tail 앞의 요소는 누구나 추적자 두 개가 따라다녀야 한다.
		// └ trace1 과 trace2 사이에 끼워넣어야 한다.
		
		trace2.next = temp;
		temp.next = tail;
	}
	
	public T find(T data)
	{
		//data를 찾아서 있으면 '찾았다'를 반환, 없으면 '못 찾았다'를 반환
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
//		// 1. 노드 만들고, 데이터 넣고
//		Node2<T> temp = new Node2<T>();
//		temp.data = data;
//		
//		//자기 위치값을 찾아간다. 나보다 더 뒤에 있는 요소를 만남 or tail을 만남.
//		//내 다음 번 요소는 아는데, 내 앞의 요소를 모른다.
//		// └ 항상 추적용 Node가 두 개여야 한다.
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
	
	//head쪽 삭제
	public void deleteHead()
	{
		if(head.next == tail) //함수 만들 때 에러처리를 먼저 한다ㅏ.
			return;
		
		head.next = head.next.next;
	}
	
	//전체삭제
	public void deleteAll()
	{
		head.next = tail;
	}
	
	//tail쪽 삭제
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
	
	//항목 찾아서 삭제
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










