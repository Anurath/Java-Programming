class Book
{
	String name;
	String author;
	double price;
	int pages;
	int year;
	{
		System.out.println("Non static block starts");
		displayBook();
	}
	public Book(String name,String author,double price,int pages,int year)
	{
		System.out.println("Constructor Starts");
		this.name=name;
		this.author=author;
		this.price=price;
		this.pages=pages;
		this.year=year;
	}
	public void displayBook()
	{
		System.out.println("Name: "+name);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Pages: "+pages);
		System.out.println("Year: "+year);
	}
}