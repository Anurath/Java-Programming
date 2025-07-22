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
}