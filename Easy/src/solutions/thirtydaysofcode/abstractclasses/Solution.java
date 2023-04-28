package solutions.thirtydaysofcode.abstractclasses;

import java.io.*;

/**
 * <p>
 * Given a Book class and a Solution class, write a MyBook class that does the following:
 *     Inherits from Book
 *     Has a parameterized constructor taking these 3 parameters:
 *         string title
 *         string author
 *         int price
 *     Implements the Book class' abstract display() method so it prints these 3 lines:
 *     "Title:", a space, and then the current instance's title.
 *     "Author:", a space, and then the current instance's author.
 *     "Price:", a space, and then the current instance's price.
 *     
 * Input format from console is as example:
 * The Alchemist
 * Paulo Coelho
 * 248
 * </p>
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {

	// Reads console input, defines necessary variables from it, creates an instance of MyBook, calls display method
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String title = reader.readLine().trim();
		String author = reader.readLine().trim();
		int price = Integer.parseInt(reader.readLine().trim());
		
		MyBook myBook = new MyBook(title, author, price);
		myBook.display();
		

	}
	
	static class MyBook extends Book{
	    String title;
	    String author;
	    int price;
	    
	    MyBook(String title, String author, int price){
	        this.title =  title;
	        this.author = author;
	        this.price = price;
	    }

		@Override
		void display() {
			System.out.printf("Title: %s\n",this.title);
	        System.out.printf("Author: %s\n", this.author);
	        System.out.printf("Price: %d", this.price);
		}
	}    
	static abstract class Book{
		abstract void display();
	}

}
