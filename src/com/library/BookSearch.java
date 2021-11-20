package com.library;

import java.util.Map;

public class BookSearch {
	private   Map<String, Book> nameMap;
	
   public Book getBookDetails(Integer);
   public Book addBooksInSearch(Integer,Book);
   
	public BookSearch(Map<String, Book> nameMap) {
		super();
		this.nameMap = nameMap;
	}

	public Map<String, Book> getNameMap() {
		return nameMap;
	}

	public void setNameMap(Map<String, Book> nameMap) {
		this.nameMap = nameMap;
	}
	

}
