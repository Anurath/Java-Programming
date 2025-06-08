package superCallStatement;

public class College extends University{
	String clgName;
	String principal;
	int clgStd;
	int clgYear;
	
	College(){}
	
	College(String uniName, long uniStd,String vc,int dpCount,int uniYear,String type,String clgName,String principal,int clgStd,int clgYear)
	{
		super(uniName,uniStd,vc,dpCount,uniYear,type);
		
		this.clgName = clgName;
		this.principal = principal;
		this.clgStd = clgStd;
		this.clgYear = clgYear;
	}
	
	public void displayCollege()
	{
		System.out.println("College Name: "+clgName);
		System.out.println("College Principal: "+principal);
		System.out.println("College Student Count: "+clgStd);
		System.out.println("College Istablishment Year: "+clgYear);
	}
}
