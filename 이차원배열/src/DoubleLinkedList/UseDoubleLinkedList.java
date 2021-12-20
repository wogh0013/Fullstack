package DoubleLinkedList;

public class UseDoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		//큐 구조라서 정렬순서 제대로!
		list.insertTail("A");
		list.insertTail("B");
		list.insertTail("C");
		list.insertTail("D");
		list.insertTail("E");
		list.insertTail("F");
		
		list.display();
		System.out.println();
		
		list.reverseDisplay();
		System.out.println();
	}
}
