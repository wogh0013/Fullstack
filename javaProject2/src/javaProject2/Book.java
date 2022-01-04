package javaProject2;

public class Book {
	String bookNo="";
	String bookTitle="";
	String bookAuthor="";
	int bookYear=0;
	int bookPrice=0;
	String bookPublisher="";
	
	public Book() {
		
	}

	public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		
		return String.format("%s %s %s %d %d %s", bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
	}
	
	
	
}
