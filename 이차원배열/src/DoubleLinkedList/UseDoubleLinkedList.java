package DoubleLinkedList;

public class UseDoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		//ť ������ ���ļ��� �����!
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
