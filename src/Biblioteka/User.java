package Biblioteka;

public class User {

	private String name;
	private int maxBooks = 3;
	private static int userIDStatic= 1; 
	private int userID;

	public User (){
		
	}
	
	public User(String name) {
		this.name = name;
		this.userID = userIDStatic; 
		userIDStatic++; // broj je jedinstven i dodjeljuje se svakom korisniku
	}

	public String getName() {
		return this.name;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}

	public int getMaxBooks() {
		return this.maxBooks;
	}

	public int getUserID() {
		return userID;
	}

	public static int getIdUser() {
		return userIDStatic;
	}

	@Override
	public String toString() {
		return "User ID " + getUserID() + " NAME:" + getName() + " ("
				+ this.getMaxBooks() + " max books)\n ";
	}

}