package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.library.model.Books;

public interface booksInterface {

	public void addBooks(String bname, double bookPrice, String author);
	public ArrayList<Books> displayBooks();
	public  ArrayList<Books> searchBooks(String bname);
	public  void deleteBook(String bname);
}
