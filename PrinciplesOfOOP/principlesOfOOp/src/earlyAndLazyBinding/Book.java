package earlyAndLazyBinding;

public class Book {
	String name;
	double price;
	int pages;
	String author;
	
	Book(){}
	
	Book(String name,double price,int pages,String author)
	{
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.author = author;
	}
	
	public void displayBook()
	{
		System.out.println("------------------Book Info--------------------");
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Pages: "+pages);
		System.out.println("Author: "+author);
	}
}
