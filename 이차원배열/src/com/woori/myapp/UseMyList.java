package com.woori.myapp;

public class UseMyList {
	public static void main(String[] args) {
		MyList list = new MyList();
		
//		list.insertHead("A");
//		list.insertHead("B");
//		list.insertHead("C");
//		list.insertHead("D");
//		list.insertHead("E");
//		list.insertHead("F");
		
//		list.insertTail("A");
//		list.insertTail("B");
//		list.insertTail("C");
//		list.insertTail("D");
//		list.insertTail("E");
//		list.insertTail("F");
		
		//���� ��� X -> �˾Ƽ� ���ĵ�
		list.orderedInsert("A");
		list.orderedInsert("F");
		list.orderedInsert("B");
		list.orderedInsert("D");
		list.orderedInsert("E");
		list.orderedInsert("C");
		
		list.deleteHead();
		list.display();
		System.out.println("------------------------");
		
		list.deleteTail();
		list.display();
		System.out.println("------------------------");
		
		list.deleteItem("D");
		list.display();
		System.out.println("------------------------");
	}
}
