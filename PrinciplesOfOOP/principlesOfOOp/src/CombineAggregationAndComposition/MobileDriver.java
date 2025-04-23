package CombineAggregationAndComposition;

public class MobileDriver {
	public static void main(String[] args) {
		OperatingSystem os = new OperatingSystem("15","Anroid",16,"17/04/2025");
		Mobile m1 = new Mobile("Redmi","Redmi 13 Pro",14000,"Blue",3,os);
		m1.displayMobile();
		m1.battery.displayBattery();
		m1.p.displayProcessor();
		m1.os.displayOperatingSystem();
	}
}
