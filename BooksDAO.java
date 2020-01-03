package com.deloitte.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.deloitte.library.model.Books;


public class BooksDAO {
	
	public static Connection connectToDB()
	{
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			return connection;
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return null;
		}
		
		
	}
	public static void addBooks(Books book)
	{
		System.out.println(book);
		try {
			Connection con = connectToDB();
			//STEP 3 CREATE THE STATEMENT
			PreparedStatement stmt = con.prepareStatement("insert into books values(?,?,?,?)");
			stmt.setInt(1, Books.getCount());
			stmt.setString(2,book.getBookName());
			stmt.setString(3, book.getBookAuthor());
			stmt.setDouble(4,book.getPrice());
			//STEP 4 EXECUTE SQL QUERY
			int affectedRows = stmt.executeUpdate() ;
			System.out.println("Affected rows:"+affectedRows);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Books> displayBooks()
	{
		ArrayList<Books> booklist = new ArrayList<Books>();
		try
		{
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from books");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				Books book = new Books();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookAuthor(rs.getNString(3));
				book.setPrice(rs.getDouble(4));
				booklist.add(book);	
			}
			con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}
	public static ArrayList<Books> searchBooks(String bname)
	{

		ArrayList<Books> booklist = new ArrayList<Books>();
		try
		{
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from books where bookname=?");
			stmt.setString(1, bname);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				Books book = new Books();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookAuthor(rs.getNString(3));
				book.setPrice(rs.getDouble(4));
				booklist.add(book);	
			}
			con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}
	
	public static void deleteBook(String bname)
	{

		ArrayList<Books> booklist = new ArrayList<Books>();
		try
		{
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("delete from books where bookname=?");
			
			int affectedRows = stmt.executeUpdate() ;
			System.out.println("Affected rows:"+affectedRows);
			
		}	
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
