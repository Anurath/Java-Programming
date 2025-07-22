package database;

public class EmployeeDBDriver {

	public static void main(String[] args)
	{
		EmployeeDB e1 = new EmployeeDB("Anurath","123");
		
		e1.login("Anurath", "123");
		
		e1.addEmployee("Ram", 12, 30, 7008, "CEO", "12/03/2003", 22000, 2000);
		e1.addEmployee("Shivam", 13, 10, 7001, "Manager", "15/07/2005", 45000, 5000);
		e1.addEmployee("Ravi", 14, 20, 7008, "Salesman", "23/11/2006", 21000, 1800);
		e1.addEmployee("Mohan", 15, 30, 7002, "Analyst", "01/02/2010", 50000, 3000);
		e1.addEmployee("Raghav", 16, 10, 7001, "Developer", "10/05/2004", 48000, 5500);
		e1.addEmployee("Ganesh", 17, 20, 7003, "Salesman", "19/06/2009", 30000, 2500);
		e1.addEmployee("Arjun", 18, 30, 7002, "Manager", "14/01/2008", 23000, 1000);
		e1.addEmployee("Mahesh", 19, 10, 7001, "Developer", "25/12/2001", 46000, 4500);
		e1.addEmployee("Nikhil", 20, 20, 7005, "Analyst", "07/09/2013", 31000, 2200);
		e1.addEmployee("Sagar", 21, 30, 7002, "Salesman", "03/03/2012", 51000, 3500);
		e1.addEmployee("Deepak", 22, 10, 7001, "Clerk", "16/10/2007", 24000, 1500);
		e1.addEmployee("Karna", 23, 20, 7006, "Manager", "21/04/2011", 32000, 2000);
		e1.addEmployee("Kunal", 24, 30, 7002, "Developer", "02/08/2000", 60000, 6000);
		e1.addEmployee("Raghav", 25, 10, 7001, "Clerk", "13/11/2002", 25000, 1200);
		e1.addEmployee("Meera", 26, 20, 7003, "Analyst", "05/05/2015", 52000, 4000);
		e1.addEmployee("Lalit", 27, 30, 7008, "Analyst", "17/07/2010", 26000, 1000);
		e1.addEmployee("Hemant", 28, 10, 7001, "Manager", "09/01/2006", 28000, 2100);
		e1.addEmployee("Suraj", 29, 20, 7006, "Developer", "26/03/2009", 47000, 4700);
		e1.addEmployee("Bharat", 30, 30, 7002, "Manager", "30/06/2004", 22500, 1300);
		e1.addEmployee("Varun", 31, 10, 7001, "Clerk", "11/12/2016", 53000, 3800);

		e1.searchByLessSalery(30000);
	}
}
