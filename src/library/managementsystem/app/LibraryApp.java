package library.managementsystem.app;


import library.managementsystem.Book;
import library.managementsystem.Library;

/*
 * Author: Brandon Gomes
 */
public class LibraryApp {
	
	public void Main() {
		
		// Create Library object
		Library Ellis = new Library();
		
		// Task: Add Books (min. 3)]
		// Initialize variables
		boolean isAdded;
		Book[] booksToAdd = new Book[3];
		
		// Create books to be added
		booksToAdd[0] = new Book();
		booksToAdd[1] = new Book("For a New Liberty", "Murray N. Rothbard", "9781610167314", 64.68);
		booksToAdd[2] = new Book("The Screwtape Letters", "C.S. Lewis", "9798343951851", 67.54);
		
		// Add books to library
		for (Book book : booksToAdd) {
			// Add book
			isAdded = Ellis.addBook(book);
			// Check success
			if (isAdded) { 
				System.out.println("Successfully added " + book.getTitle()); 
			} else {
				System.out.println("Failed to add " + book.getTitle());
			}
		}
		
		
		// Task: Search by ISBN & display Book
		
		
		// Task: Remove Book that exists
		
		
		// Task: Remove Book that does not exist
		
		
		// Display all Books
		
	}
	
	
}
