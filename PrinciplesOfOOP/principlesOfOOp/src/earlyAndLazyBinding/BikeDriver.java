package earlyAndLazyBinding;

public class BikeDriver {
	public static void main(String[] args)
	{
		Bike b1 = new Bike("Hero","Hero X",140000);
		b1.displayBike();
		b1.e.displayEngine();
	}
}
