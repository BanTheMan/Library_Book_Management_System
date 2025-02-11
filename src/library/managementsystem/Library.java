package library.managementsystem;
import library.managementsystem.Book;

/*
 * Author: Ivan Rhodes
 */
public class Library {

	private Book[] books = new Book[5];
	private int count;// Define Attributes
	public void books() {
	
	}
	// Methods:
	
	// Add
	public boolean addBook(Book book) {
		if(count < 5) {
			books[count + 1] = book;
			return true;
		}
		return false;
		
	}
	
	// Remove
	public boolean removeBook(Book book) { 
		for(int i = 0; i < 5; i++)
		{
			if(books[i] == book)
			{
				count --;
				books[i] = null;
			}
		}
		return false; 
	}
	
	// Search
	public Book searchByISBN(String ISBN) { 
		for(int i = 0; i < 5; i++) {
			if( books[i].getISBN() == ISBN) 
			{
				return books[i];
			}
		}
		return null;
	}
	
	// Display
	public void displayBooks() {
		
	}
}
