package javaProject2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		
	ArrayList<Book> list = new ArrayList<>();
	
	list.add(new Book("B001", "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�"));
	list.add(new Book("B002", "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�"));
	list.add(new Book("B003", "HTML/CSS", "������", 18000, 2021, "�������ǻ�"));
	
	System.out.println("������ȣ     ������    ����   ����   ������   ���ǻ�");
	System.out.println("----------------------------------------");
	for(Book book : list) {
		System.out.println(book.toString());
	}
	
	System.out.println();
	
	ArrayList<Magazine> list2 = new ArrayList<>();
	
	list2.add(new Magazine("M001", "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5));
	list2.add(new Magazine("M002", "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7));
	list2.add(new Magazine("M003", "���� ����", "������", 18000, 2021, "�������ǻ�", 9));
	
	System.out.println("������ȣ  ������  ������  ����  ���࿬��  ���ǻ�  �����");
	System.out.println("---------------------------------------------------");
	for(Magazine magazine : list2) {
		System.out.println(magazine.toString());
	}
	}
}
