package CombineAggregationAndComposition;

public class MobileDriver2 {
	public static void main(String[] args) {
		Processor2 processor = new Processor2("SnapDragon",144,"5G",12,512);
		Mobile2 m1 = new Mobile2("Redmi","Redmi 13 pro",12000,"Blue",processor);
		m1.displayMobile();
		m1.b.displayBattery();
		m1.processor.displayProcessor();
		m1.processor.getOS().displayOperatingSystem();
	}
}
