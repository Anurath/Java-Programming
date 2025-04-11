package earlyAndLazyBinding;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car("MG",2300000);
		c1.displayCar();
		c1.insertTyre();
		c1.t.displayType();
	}
}
