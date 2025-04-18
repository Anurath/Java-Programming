package earlyAndLazyBinding;

public class Library {
	String librarian;
	Book b1;
	
	Library(){}
	
	Library(String librarian)
	{
		this.librarian = librarian;
	}
	
	public void placeBook(String name,double price,int pages,String author)
	{
		b1 = new Book(name,price,pages,author);
	}
	public void displayLibrarian()
	{
		System.out.println("Librarian: "+librarian);
	}
}
