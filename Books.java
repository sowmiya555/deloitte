package com.deloitte.library.model;

public class Books {
	
	private int bookId;
	private String bookName;
	private double price;
	private String bookAuthor;
	private static int count=101;
	
	public Books()
	{
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Books.count = count;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double bookPrice) {
		this.price = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", bookAuthor=" + bookAuthor
				+ "]";
	}
}
