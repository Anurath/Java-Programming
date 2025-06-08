package superCallStatement;

public class Department extends College {
	String dpName;
	int dpStd;
	String hod;
	int staff;
	
	Department(){}
	
	Department(String uniName, long uniStd,String vc,int dpCount,int uniYear,String type,String clgName,String principal,int clgStd,int clgYear,String dpName,int dpStd,String hod,int staff)
	{
		super(uniName,uniStd,vc,dpCount,uniYear,type,clgName,principal,clgStd,clgYear);
		
		this.dpName = dpName;
		this.dpStd = dpStd;
		this.hod = hod;
		this.staff = staff;
	}
	
	public void displayDepartment()
	{
		displayCollege();
		System.out.println("Department Name: "+dpName);
		System.out.println("Department Student Count: "+dpStd);
		System.out.println("Department HOD: "+hod);
		System.out.println("Department Staff Count: "+staff);
	}
}
