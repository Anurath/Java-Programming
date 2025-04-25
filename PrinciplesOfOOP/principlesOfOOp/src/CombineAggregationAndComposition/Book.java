package CombineAggregationAndComposition;

public class Book {
	String name;
	String author;
	double price;
	int pages;
	
	Book(){}
	
	Book(String name,String author,double price, int pages)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.pages = pages;
		System.out.println("Object of Book has been created");
	}
	
	public void displayBook()
	{
		System.out.println("-------------Book-----------------");
		System.out.println("Name: "+name);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Pages: "+pages);
	}
}
