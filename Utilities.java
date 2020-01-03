package com.deloitte.library.utilities;

import com.deloitte.library.exception.BookNameException;

public class Utilities {

	 public static void nameValidation(String bookName) throws BookNameException
	 {
		String pattern = "^[A-Za-z]+$";
		if(!bookName.matches(pattern))
		{
			throw new BookNameException("Name can only have alphabets");
			
		}
		 
	 }
}
