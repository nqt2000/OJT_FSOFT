package exercise1;

public class Book {
	String Name;
	int ISBN;
	String Author;
	String Publisher;
	
	public Book(String name, int isbn, String author, String publisher) {
		this.Name = name;
		this.ISBN = isbn;
		this.Author = author;
		this.Publisher = publisher;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	

	public void setISBN(int isbn) {
		this.ISBN = isbn;
	}
	
	public void setAuthor(String author) {
		this.Author = author;
	}
	
	public void setPublisher(String publisher) {
		this.Publisher = publisher;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public String getPublisher() {
		return Publisher;
	}
	
	String getBookInfo() {
		String info = "Name: " + Name + "\nISBN: " + ISBN + "\nAuthor: " + Author + "\nPublisher: " + Publisher;
		return info;
	}
}

