package library.managementsystem;
import library.managementsystem.Book;

/*
 * Author: Ivan Rhodes
 */
public class Library {

	// Define Attributes
	private Book[] books = new Book[5];
	private int count;
	
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
			for(int i = 0; i < 5; i++)
			{
				if(books[i] == null)
				{
					books[i] = book;
					count++;
					return true;
				}
			}
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
		for(int i = 0; i < 5; i++)
		{
			if(books[i].equals(book) == true)
			{
				count--;
				books[i] = null;
				return true;
			}
		}
		return false; 
	}
	
	// Search
	public Book searchByISBN(String ISBN) { 
		// Compare given ISBN to books in Library
		for(int i = 0; i < count; i++) {
			String compare = (books[i].getISBN());
			if( compare.equals(ISBN) == true) 
			{
				Book copy = new Book(books[i]);
				return copy;
			}
		}
		return null;
	}
	
	// Display
	public void displayBooks() {
		// Print string description of each book
		for(Book book: books)
		{
			System.out.println(book.toString());
		}
	}
}
