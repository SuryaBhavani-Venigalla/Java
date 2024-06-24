package com.infy;

public class BookManagementSystem {

	public static void main(String[] args) {
		Book book1=new Book(1,"ABC","XYZ",true);
        Book book2=new Book(2,"def","lmn",false);
        Book book3=new Book(3,"hij","klm",true);
        Library lib=new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.replaceBook(2);
        lib.displayBooks();
        
	}

	
}
