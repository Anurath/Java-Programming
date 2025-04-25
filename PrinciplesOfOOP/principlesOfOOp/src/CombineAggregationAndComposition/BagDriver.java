package CombineAggregationAndComposition;

public class BagDriver {
	public static void main(String[] args) {
		//Bag
		Bag b1 = new Bag("Apple",1200,3);
		b1.displayBag();
		//Pen
		b1.addPen("Try Max",50,true,"Black");
		b1.p.displayPen();
		//Laptop
		b1.addLaptop("Ausu","Asus Vivobook 15",48000,16, 512);
		b1.l.displayLaptop();
		//Water
		b1.addWaterBall(100,2,"Blue","Sky");
		b1.w.displayWaterBall();
		//Book
		b1.addBook("Silent Patient","Alexender Phleming",180,230);
		b1.b.displayBook();
		
	}
}
