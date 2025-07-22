package database;

public class Employee {

	String name;
	int empid;
	int deptNo;
	int managerNo;
	String hireDate;
	double sal;
	double comm;
	String job;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name,int empid,int deptNo,int managerNo,String hireDate,double sal,double comm,String job)
	{
		this.name = name;
		this.empid = empid;
		this.deptNo = deptNo;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.job = job;
	}
	
	public String toString()
	{
		return "[ Name: "+name+", Employee Id: "+empid+", Department No: "+deptNo+", Manager No: "+managerNo+", Hire Date: "+hireDate+", Salary: "+sal+", Commission: "+comm+", Job: "+job+" ]";
	}
}
