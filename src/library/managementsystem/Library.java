package library.managementsystem;
import library.managementsystem.Book;


/**
 * Author: Ivan Rhodes
 */
public class Library {

	// Define Attributes
	private Book[] books = new Book[5];
	private int count;
	
	/**
	 * Default Constructor
	 * Added for the completeness of the JavaDoc
	 */
	public Library() {
	}
	
	// Methods:
	
	/**
	 * Add book to library
	 * @param book to be added to the library.
	 * @return True or false based on if a book was added or not.
	 */
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

	/**
	 * Remove book from the library
	 * @param book to be removed from the library.
	 * @return True or false depending on if a book was removed from the library or not.
	 */
	public boolean removeBook(Book book) { 
		// Check edge case
		if(book == null)
		{
			return false;
		}
		// Find and remove book
		for(int i = 0; i < 5; i++)
		{
			if(books[i] != null) {
				if(books[i].equals(book) == true)
				{
					count--;
					books[i] = null;
					return true;
				}
			}
		}
		return false; 
	}
	
	/**
	 * Search for book with a given ISBN number in the library
	 * @param ISBN to search for.
	 * @return Book that matches the ISBN, or null if there is no match.
	 */
	public Book searchByISBN(String ISBN) { 
		// Compare given ISBN to books in Library
		for(Book book: books) {
			if(book != null) {
				String compare = (book.getISBN());
				if( compare.equals(ISBN) == true) 
				{
					Book copy = new Book(book);
					return copy;
				}
			}
		}
		return null;
	}
	
	// Display
	/** Print the title, author, ISBN, and price of each book in the library
	 * 
	 */
	public void displayBooks() {
		// Print string description of each book
		for(Book book: books)
		{
			if (book != null) {
				System.out.println(book.toString());
			}
		}
	}
}
