class Demo
{
	String name;
	String breed;
	int maxMilk;
	int maxAge;
	String snf;

	Demo(){}

	Demo(String name,String breed,int maxMilk,int maxAge,String snf)
	{
		this.name = name ;
		this.breed = breed;
		this.maxMilk = maxMilk;
		this.maxAge = maxAge;
		this.snf = snf;
	}

	public void displayMilkPric()
	{
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
		System.out.println("Max Milk: "+maxMilk);
		System.out.println("Max Age: "+maxAge);
		System.out.println("SNF: "+snf);

		if (snf.charAt(0)=='h' && breed.charAt(0)=='D')
		{
			System.out.println("Mink Price: "+58);
		}
		else if (snf.charAt(0)=='m' && breed.charAt(0)=='D')
		{
			System.out.println("Mink Price: "+50);
		}
		else if (snf.charAt(0)=='l' && breed.charAt(0)=='D')
		{
			System.out.println("Mink Price: "+45);
		}



		else if (snf.charAt(0)=='h' && breed.charAt(0)=='V')
		{
			System.out.println("Mink Price: "+70);
		}
		else if (snf.charAt(0)=='m' && breed.charAt(0)=='V')
		{
			System.out.println("Mink Price: "+60);
		}
		else if (snf.charAt(0)=='l' && breed.charAt(0)=='V')
		{
			System.out.println("Mink Price: "+47);
		}



		else if (snf.charAt(0)=='h' && breed.charAt(0)=='K')
		{
			System.out.println("Mink Price: "+65);
		}
		else if (snf.charAt(0)=='m' && breed.charAt(0)=='K')
		{
			System.out.println("Mink Price: "+60);
		}
		else if (snf.charAt(0)=='l' && breed.charAt(0)=='K')
		{
			System.out.println("Mink Price: "+55);
		}
		System.out.println();
	}
}
