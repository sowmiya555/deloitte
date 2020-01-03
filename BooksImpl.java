package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.dao.BooksDAO;
import com.deloitte.library.model.Books;


public class BooksImpl implements booksInterface {

	
	@Override
	public void deleteBook(String bname) {
		// TODO Auto-generated method stub
		BooksDAO.deleteBook(bname);
	}

	@Override
	public ArrayList<Books> searchBooks(String bname) {
		// TODO Auto-generated method stub
		return BooksDAO.searchBooks(bname);
		                                                 
	}

	@Override
	public void addBooks(String bname, double bookPrice, String author) {
		Books book = new Books();
		book.setBookId(Books.getCount());
		book.setBookName(bname);
		book.setBookAuthor(author);
		book.setPrice(bookPrice);
		BooksDAO.addBooks(book);;
		
	}
	
	@Override
	public ArrayList<Books> displayBooks() {
		// TODO Auto-generated method stub
		return BooksDAO.displayBooks();
		
	}

	
}
	


