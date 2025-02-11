package library.managementsystem;

/*
 * Author: Nate Spencer
 */
public class Book {
	
	// Define private attributes
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	// Default Constructor
	public Book() {
		 this.title = "Unknown";
		 this.author = "Unknown";
		 this.ISBN = "Unknown";
		 this.price = 0.0;
	 }
	
	// Parameterized Constructor
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
		
	// Copy Constructor
	public Book(Book otherBook) {
		this.title = otherBook.title;
		this.author = otherBook.author;
		this.ISBN = otherBook.ISBN;
		this.price = otherBook.price;
	}
	
	// Getters & Setters
	public String getTitle() { 
		return title; 
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	//Return a string representation of the book
	@Override
	public String toString() {
		return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + ISBN + ", Price=" + price + "]";
	}

	// Compare Functions
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false; 
		}
		
		Book book = (Book) other;
		return this.getISBN().equals(book.getISBN());
	}


}
