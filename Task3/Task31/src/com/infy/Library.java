package com.infy;

import java.util.ArrayList;


public class Library {
	 ArrayList<Book> books;
	
	public Library() {
		this.books=new ArrayList<Book>();
	}

	public void addBook(Book newBook) {
		books.add(newBook);
	}
	public void replaceBook(int id) {
		books.remove(id);
			}
    public void displayBooks() {
    	for(Book b:books) {
    		System.out.println(b.getBookId());
    		System.out.println(b.getTitle());
    		System.out.println(b.getAuthor());
    		System.out.println(b.isAvailable());
    		
    	}
    	
    }
				
				
				
	}

