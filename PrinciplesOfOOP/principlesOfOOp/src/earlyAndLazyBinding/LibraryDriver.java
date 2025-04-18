package earlyAndLazyBinding;

public class LibraryDriver {
	public static void main(String[] args)
	{
		Library l1 = new Library("Ramu");
		l1.placeBook("Selent Patient",180,280,"Alezander Pheming");
		l1.b1.displayBook();
	}
}
