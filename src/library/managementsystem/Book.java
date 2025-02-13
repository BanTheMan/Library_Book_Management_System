package library.managementsystem;


/**
 * Author: Nate Spencer
 * Used for storing and manipulating book information
 */
public class Book {
	
	// Define private attributes
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * Default Constructor
	 */
	public Book() {
		 this.title = "Unknown";
		 this.author = "Unknown";
		 this.ISBN = "Unknown";
		 this.price = 0.0;
	 }
	
	/**
	 * Parameterized Constructor
	 * @param title of book being created
	 * @param author of book being created
	 * @param ISBN of book being created
	 * @param price of book being created
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
		
	/**
	 * Copy Constructor
	 * @param otherBook book to be copied
	 */
	public Book(Book otherBook) {
		this.title = otherBook.getTitle();
		this.author = otherBook.getAuthor();
		this.ISBN = otherBook.getISBN();
		this.price = otherBook.getPrice();
	}
	
	/**
	 * Get book title
	 * @return book title String
	 */
	public String getTitle() { 
		return title; 
	}
	
	/**
	 * Get book author
	 * @return book author String
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Get book ISBN
	 * @return book ISBN number String
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * Get book price
	 * @return book price double
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set book title
	 * @param title String to set the book's title to
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Set book author
	 * @param author String to set the book's author to
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Set book ISBN number
	 * @param ISBN String to set the book's ISBN number to
	 */
	public void setISBN(String ISBN) {
		ISBN = ISBN;
	}
	
	/**
	 * Set book price
	 * @param price double to set the book's price to
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Return a string representation of the book
	 */
	@Override
	public String toString() {
		return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + ISBN + ", Price=" + price + "]";
	}

	/**
	 * Compare two books to see if they are the same
	 */
	@Override
	public boolean equals(Object other) {
		// Check edge case
		if (other == null) {
			return false; 
		}
		// Compare ISBN numbers
		Book book = (Book) other;
		return this.getISBN().equals(book.getISBN());
	}


}
