package com.library;

public class BookCell {
	private int bookCellId;
	private Book book;
	public BookCell(int bookCellId, Book book) {
		super();
		this.bookCellId = bookCellId;
		this.book = book;
	}
	public int getBookCellId() {
		return bookCellId;
	}
	public void setBookCellId(int bookCellId) {
		this.bookCellId = bookCellId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
