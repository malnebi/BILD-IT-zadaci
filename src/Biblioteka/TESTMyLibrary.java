package Biblioteka;

public class TESTMyLibrary {
	 
    public static void main(String[] args) {
        
    	// creating a library object 
        MyLibrary lib = new MyLibrary();
      
        // creating a book objects
        Book book1 = new Book("War and Peace", "Tolstoj");
        Book book2 = new Book("Ana Karenina", "Tolstoj");
        Book book3 = new Book("Sidarta", "Hese");
        Book book4 = new Book("Stepski vuk", "Hese");
       
        // adding Book objects to a MyLibrary class list
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
       
        // creating User objects
        User user1 = new User("Maja");
        User user2 = new User("Pavle");
        User user3 = new User("Ranka");
        
        // adding User objects to a MyLibrary class list
        lib.addUser(user1);
        lib.addUser(user2);
        lib.addUser(user3);
 
        
//      System.out.println("LIBRARY STATUS before borrowing books");
//      lib.printStatus();
//      System.out.println();
        
        // izdavanje knjiga 1. korisniku
        lib.borrowBook(book1, user1);
        lib.borrowBook(book2, user1);
        lib.borrowBook(book3, user1);
        
        System.out.println("Total log now is: " + MyLibrary.getTotalLog());
        System.out.println();
        
        //an attempt to borrow a book to the user with maximum books
        lib.borrowBook(book4, user1);
       
        // an attempt to borrow an allready borrowed book 
        lib.borrowBook(book1, user2);

        System.out.println("LIBRARY STATUS after BORROWING BOOKS");
        lib.printStatus();
 
        
    }
 
}