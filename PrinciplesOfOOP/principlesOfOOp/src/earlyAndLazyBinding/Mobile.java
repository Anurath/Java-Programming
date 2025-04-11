package earlyAndLazyBinding;

public class Mobile {
		String name;
		double price;
		String type;
		Charger c;
		Mobile(){}
		
		Mobile(String name,double price,String type,String chargerName,String chargerType,double chargerPrice)
		{
			c = new Charger(chargerName,chargerType,chargerPrice);
			
			this.name = name ;
			this.price = price;
			this.type = type;
		}
		
		public void displayMobile()
		{
			System.out.println(name);
			System.out.println(price);
			System.out.println(type);
		}
}
