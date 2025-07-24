package database;

public class EmployeeDB {
	
	private String pass;
	
	private String user;
	
	private boolean connect;
	
	private Employee[] db = new Employee[10];
	
	private int count =0;
	
	private int index = 0;
	
	public EmployeeDB() {}
	
	
	public EmployeeDB(String user,String pass)
	{
		this.user = user;
		this.pass = pass;
		
		System.out.println("Database is created!");
	}
	
	public void login(String user,String pass)
	{
		if(this.user.equals(user)&&this.pass.equals(pass))
		{
			connect = true;
			System.out.println("Database is connected!");
		}
		else
		{
			System.out.println("could not resolve th econnectt identifier specified");
		}
	}
	public boolean addEmployee(String name,int empid,int deptNo,int managerNo,String job,String hireDate,double sal,double comm)
	{
		if(connect&&count<0.75*db.length)
		{
			db[index++] = new Employee(name,empid,deptNo,managerNo,hireDate,sal,comm,job);
			count++;
			return true;
		}
		else if(connect)
		{
			Employee[] temp = new Employee[db.length*2];
			 for(int i=0;i<db.length;i++)
			 {
				 temp[i]=db[i];
			 }
			 db = temp;
			 db[index++] = new Employee(name,empid,deptNo,managerNo,hireDate,sal,comm,job);
			 count++;
			 return true;
		}
		else {
			System.out.println("could not resolve th econnectt identifier specified");
			return false;
		}
	}

	public void showDB()
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					System.out.println(db[i]);
				}
			}
		}
		else
		{
			System.out.println("could not resolve th econnectt identifier specified");
		}
	}
	
	public void showByJob(String job)
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					if(db[i].job.equals(job))
					{
						System.out.println(db[i]);
					}
				}
			}
		}
	}
	
	public void searchByDept(int deptNo)
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					if(db[i].deptNo == deptNo)
					{
						System.out.println(db[i]);
					}
				}
			}
		}
	}
	
	public void searchByManageNo(int managerNo)
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					if(db[i].managerNo == managerNo)
					{
						System.out.println(db[i]);
					}
				}
			}
		}
	}
	
	public void searchByEqualSalery(double sal)
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					if(db[i].sal==sal)
					{
						System.out.println(db[i]);
					}
				}
			}
		}
	}
	
	
	public void searchByGreaterSalery(double sal)
	{
		if(connect)
		{
			for(int i=0;i<index;i++)
			{
					if(db[i].sal>sal)
					{
						System.out.println(db[i]);
					}
			}
		}
	}
	
	public void searchByLessSalery(double sal)
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
				{
					if(db[i].sal<sal)
					{
						System.out.println(db[i]);
					}
				}
			}
		}
	}
	
	public void searchByWorkingUnderManager(int managerNo)
	{
		if(connect)
		{
			for(int i=0;i<index;i++)
			{
				if(db[i].managerNo == managerNo)
				{
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByNoCommission()
	{
		if(connect)
		{
			for(int i=0;i<index;i++)
			{
				if(db[i].comm== 0)
				{
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByGreatereCommission(double comm)
	{
		if(connect)
		{
			for(int i=0;i<index;i++)
			{
				if(db[i].comm>comm)
				{
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByLesserCommission(double comm)
	{
		if(connect)
		{
			for(int i=0;i<index;i++)
			{
				if(db[i].comm<comm)
				{
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void maxSaleryHolder()
	{
		if(connect)
		{
			double max = db[0].sal;
			int idx = 0;
			for(int i=1;i<index;i++)
			{
				if(db[i].sal>max)
				{
					max=db[i].sal;
					idx = i;
				}
			}
			System.out.println(db[idx]);
		}
	}
	
	public void SecondMaxSaleryHolder()
	{
		if(connect)
		{
			double max = db[0].sal;
			int idxMax=0,idxSec = 0;
			double secMax = max;
			for(int i=1;i<index;i++)
			{
				if(db[i].sal>max)
				{
					secMax = max;
					max=db[i].sal;
					idxMax = i;
				}
				else if(db[i].sal>secMax&& db[i].sal!=max)
				{
					secMax = db[i].sal;
					idxSec = i;
				}
			}
			System.out.print("Maximum Salery Holder Is: "+db[idxMax]);
			System.out.println("Second Maximum Salery Holder Is: "+db[idxSec]);
		}
	}
	
	public void sortBy(String attri)
	{
		if(attri.equals("EmpId")||attri.equals("Salery")||attri.equals("managerNo")||attri.equals("deptNo")||attri.equals("Name")||attri.equals("Job"))
		{
			for(int i=0;i<count-1;i++)
			{
				for(int j=0;j<count-1-i;j++)
				{
					if(checkSwap(db[j],db[j+1],attri)>0)
					{
						Employee temp = db[j];
						
						db[j] = db[j+1];
						db[j+1] = temp;
					}
				}
			}
		}
		else {
			System.out.println("Invalid Attribute");
		}
		
	}
	
	private int checkSwap(Employee e1,Employee e2,String attri)
	{
		switch(attri)
		{
			case "EmpId":
			{
				return checkSwap0(e1.empid, e2.empid);
			}
			case "Salery":
			{
				return checkSwap0(e1.sal, e2.sal);
			}
			case "managerNo":
			{
				return checkSwap0(e1.managerNo, e2.managerNo);
			}
			case "deptNo":
			{
				return checkSwap0(e1.deptNo, e2.deptNo);
			}
			case "Name":
			{
				return e1.name.compareTo(e2.name);
			}
			case "Job":
			{
				return e1.job.compareTo(e2.job);
			}
			default:
			{
				return -100;
			}
			
		}
	}
	
	
	private int checkSwap0(double n1 , double n2)
	{
		if(n1>n2)
		{
			return 1;
		}
		else if(n1<n2)
		{
			return -1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}