/*
Write a Java program to create a class called "Book" with attributes for 
title, author, and ISBN, and methods to add and remove books from a collection.
*/
import java.util.ArrayList;
public class Exercise5{
    
    static class Book{
        
        private static ArrayList<Book> bookCollection = new ArrayList<Book>();
    	private String title;
    	private String author;
    	private int isbn;
        
        public Book(String title, String author, int isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        //Getters & Setters
        public String getTitle() {
            return title;
        }

		public void setTitle(String title) {
		    this.title = title;
		}

		public String getAuthor() {
		    return author;
		}

		public void setAuthor(String author) {
		    this.author = author;
		}

		public int getIsbn() {
		    return isbn;
		}

		public void setIsbn(int isbn) {
		    this.isbn = isbn;
		}


    	public static void addBooks(Book book){
             bookCollection.add(book);
    	}

    	public static void removeBooks(Book book){
    		bookCollection.remove(book);
    	}

    	public static ArrayList < Book > get_BookCollection() {
            return bookCollection;
        }
    }

	public static void main(String[] args) {
		Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", 9780);
	    Book book2 = new Book("An Introduction to Python", "Guido van Rossum", 9355);

	    Book.addBooks(book1);
        Book.addBooks(book2);

        ArrayList < Book > bookCollection = Book.get_BookCollection();
        System.out.println("List of books:");

	    for (Book book: bookCollection) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
	    }

	    Book.removeBooks(book1);
       System.out.println("\nAfter removing " + book1.getTitle() + ":");
       System.out.println("List of books:");
	   for (Book book: bookCollection) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
	   }

	}
}