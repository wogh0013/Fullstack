package javaProject2;

public class Magazine extends Book {
	int month=0;

	public Magazine() {
		
	}
	
	
	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, int month) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
		this.month = month;
	}
	
	public String toString() {
		
		return String.format("%s %s %s %d %d %s %d", bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher, month);
	}
	
}
