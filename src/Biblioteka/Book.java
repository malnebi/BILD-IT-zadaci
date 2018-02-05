package Biblioteka;

public class Book {

	private String title;
	private String author;
	private static int bookIDStatic = 1; // unique number of a book
	private int bookID;
	User user;

	public Book() {

	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.bookID = bookIDStatic;
		bookIDStatic++;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getBookID() {
		return bookID;
	}

	public static int getIdBook() {
		return bookIDStatic;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	/** Info about a book and a status */
	@Override
	public String toString() {
		String status;
		if (this.getUser() == null) {
			status = "Avaliable";
		} else
			status = "Unavaliable";
		return "Book ID: " + getBookID() + "; Book title: \"" + getTitle()
				+ "\"; Author: " + getAuthor() + "; Status: " + status + "\n";
	}

}