package com.library;

import java.util.Map;


public class Tray {
	
	private Map<String, Book> book;
	private int trayId;
	private int trayCapacity;
	private boolean isTrayFull;	
		
	public Tray(Map<String, Book> book, int trayId) {
		super();
		this.book = book;
		this.trayId = trayId;
		trayCapacity = 100;
		
	}



	public Map<String, Book> getBook() {
		return book;
	}



	public void setBook(Map<String, Book> book) {
		this.book = book;
	}



	public int getTrayId() {
		return trayId;
	}



	public void setTrayId(int trayId) {
		this.trayId = trayId;
	}



	public int getTrayCapacity() {
		return trayCapacity;
	}



	public void setTrayCapacity(int trayCapacity) {
		this.trayCapacity = trayCapacity;
	}



	public boolean isTrayFull() {
		return isTrayFull;
	}



	public void setTrayFull(boolean isTrayFull) {
		this.isTrayFull = isTrayFull;
	}

	

	}