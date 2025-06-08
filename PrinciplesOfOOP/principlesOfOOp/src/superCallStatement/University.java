package superCallStatement;

public class University {
	String uniName;
	long uniStd;
	String vc;
	int dpCount;
	int uniYear;
	String type;
	
	University(){}
	
	University(String uniName, long uniStd,String vc,int dpCount,int uniYear,String type)
	{
		this.uniName = uniName;
		this.uniStd = uniStd;
		this.vc = vc;
		this.dpCount = dpCount;
		this.uniYear = uniYear;
		this.type = type;
	}
	
	public void displayUniversity()
	{
		System.out.println("University name: "+uniName);
		System.out.println("Student Count: "+uniStd);
		System.out.println("Vice Chancellor: "+vc);
		System.out.println("Department Count: "+dpCount);
		System.out.println("Year Of Istablishment: "+uniYear);
		System.out.println("Type Of University: "+type);
	}
}
