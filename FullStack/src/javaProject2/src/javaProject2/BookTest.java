package javaProject2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		
	ArrayList<Book> list = new ArrayList<>();
	
	list.add(new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사"));
	list.add(new Book("B002", "자바스크립트", "이몽룡", 30000, 2020, "서울출판사"));
	list.add(new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사"));
	
	System.out.println("도서번호     도서명    저자   가격   발행일   출판사");
	System.out.println("----------------------------------------");
	for(Book book : list) {
		System.out.println(book.toString());
	}
	
	System.out.println();
	
	ArrayList<Magazine> list2 = new ArrayList<>();
	
	list2.add(new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5));
	list2.add(new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7));
	list2.add(new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9));
	
	System.out.println("잡지번호  잡지명  발행인  가격  발행연도  출판사  발행월");
	System.out.println("---------------------------------------------------");
	for(Magazine magazine : list2) {
		System.out.println(magazine.toString());
	}
	}
}
