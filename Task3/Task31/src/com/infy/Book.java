package com.infy;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	public Book(int id, String name,String person, boolean available) {
		this.bookId=id;
		this.title=name;
		this.author=person;
		this.isAvailable=available;
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}
