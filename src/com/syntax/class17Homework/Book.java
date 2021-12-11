package com.syntax.class17Homework;
//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
public class Book {

	String name;
	String author;
	double price;
	int pages;
	
	Book (String bookName, String bookAuthor) {
		
		name=bookName;
		author=bookAuthor;
		System.out.println(name+" "+author);
	}
	
	public Book(double bookPrice, int bookPages) {
		
		price=bookPrice;
		pages=bookPages;
		System.out.println("Price "+price+" # of Pages "+ pages);
	}
}
