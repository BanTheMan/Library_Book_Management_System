package library.managementsystem.app;


import library.managementsystem.Book;
import library.managementsystem.Library;

/*
 * Author: Brandon Gomes
 */
public class LibraryApp {
	
	public static void main(String[] args) {
		
		// Create Library object
		Library Ellis = new Library();
		
		// Task: Add Books (min. 3)]
		// Initialize variables
		boolean isAdded;
		Book[] booksToAdd = new Book[5];
		
		// Create books to be added
		booksToAdd[0] = new Book();
		booksToAdd[1] = new Book("For a New Liberty", "Murray N. Rothbard", "9781610167314", 64.68);
		booksToAdd[2] = new Book("The Screwtape Letters", "C.S. Lewis", "9798343951851", 67.54);
		booksToAdd[3] = new Book("ESV Church Bible Black", "Lane T. Dennis, et al.", "9781433563423", 15.04);
		booksToAdd[4] = new Book("Understanding Deep Learning", "Simon J.D. Prince", "9780262048644", 100.00);
		
		
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
		Book bookFound = Ellis.searchByISBN("9798343951851");
		System.out.println("Searched for ISBN 9798343951851 and found:\n" + bookFound.toString());
		
		
		// Task: Remove Book that exists
		boolean isRemoved = Ellis.removeBook(bookFound);
		if (isRemoved) {
			System.out.println("Successfully removed " + bookFound.getTitle() + ", "
					+ "Library now holds: " + Ellis.searchByISBN("9798343951851"));
		} else {
			System.out.println("Failed to remove " + bookFound.getTitle());
		}
		
		
		// Task: Remove Book that does not exist
		isRemoved = Ellis.removeBook(bookFound);
		if (!isRemoved) {
			System.out.println("Attempted to remove " + bookFound.getTitle() + " again... "
					+ "Library did not hold it!");
		} else {
			System.out.println("Library still held a copy of " + bookFound.getTitle());
		}
		
		
		// Display all Books
		System.out.println("All books in Library:");
		Ellis.displayBooks();
		
	}
	
	
}
