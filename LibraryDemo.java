package com.deloitte.library.main;

import java.util.Scanner;

import com.deloitte.library.exception.BookNameException;
import com.deloitte.library.model.Books;
import com.deloitte.library.services.BooksImpl;
import com.deloitte.library.utilities.Utilities;

import java.util.ArrayList;

public class LibraryDemo {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Books> list =new ArrayList<Books>();

	BooksImpl booksObj = new BooksImpl();
	
	while(true)
	{
	System.out.println(" 1.Add Books "+" 2.Display Books "+" 3.search "+"4.delete"+" 4.Exit ");
	String choice=sc.next();
	switch(choice)
	{
	case "1":
		
		System.out.println("Enter Book name:");
	    String bname = sc.next();
	    try
	    {
	    	Utilities.nameValidation(bname);
	    	
	    }
	    catch(BookNameException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	    
	    System.out.println("Enter Book price:");
	    double bookPrice = sc.nextDouble();
	    System.out.println("Enter Author name:");
	    String author = sc.next();
		booksObj.addBooks(bname, bookPrice, author);
		break;
	case "2":
		
		list=booksObj.displayBooks();
		for(Books book : list)
		{
	       System.out.println(book);
		}
		
		break;
	case "3":
		System.out.println("Enter book name:");
		String bookname = sc.next();
		list=booksObj.searchBooks(bookname);
		for(Books book : list)
		{
	       System.out.println(book);
		}
		
		break;
	case "4":
		System.out.println("Enter book name:");
		String bname1 = sc.next();
		booksObj.deleteBook(bname1);
		break;
	case "5":
		System.exit(0);
	}
	}
}
}
