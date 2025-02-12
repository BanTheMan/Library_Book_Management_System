package library.managementsystem;
import library.managementsystem.Book;

/*
 * Author: Ivan Rhodes
 */
public class Library {

	private Book[] books = new Book[5];
	private int count;// Define Attributes
	
	// Methods:
	
	// Add
	public boolean addBook(Book book) {
		// Check edge case
		if(book == null)
		{
			return false;
		}
		// Place book in empty index
		if(count < 5) { // check Library capacity
			for(int i = 0; i < count; i++)
			{
				if(books[i] == null)
				{
					books[i] = book;
					count++;
				}
			}
			return true;
		}
		return false;
		
	}
	
	// Remove
	public boolean removeBook(Book book) { 
		// Check edge case
		if(book == null)
		{
			return false;
		}
		// Find and remove book
		for(int i = 0; i < count; i++)
		{
			if(books[i] == book)
			{
				count--;
				books[i] = null;
			}
		}
		return false; 
	}
	
	// Search
	public Book searchByISBN(String ISBN) { 
		// Compare given ISBN to books in Library
		for(int i = 0; i < count; i++) {
			if( books[i].getISBN() == ISBN) 
			{
				return books[i];
			}
		}
		return null;
	}
	
	// Display
	public void displayBooks() {
		// Print string description of each book
		for(int i = 0; i < count; i++)
		{
			System.out.println(books.toString());
		}
	}
}
