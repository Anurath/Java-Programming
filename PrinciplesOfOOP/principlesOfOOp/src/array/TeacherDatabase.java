package array;
import java.util.Scanner;
public class TeacherDatabase {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Teacher Count: ");
		int len = sc.nextInt();
		sc.nextLine();
		Teacher[] db = new Teacher[len];
		
		for(int i=0;i<db.length;i++)
		{
			System.out.print("Enter the name of teacher: ");
			String name = sc.nextLine();
			System.out.print("Enter the college name: ");
			String clg = sc.nextLine();
			System.out.print("Enter age: ");
			int age = sc.nextInt();
			System.out.print("Enter Phone Number: ");
			long phno = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter subject: ");
			String subject = sc.nextLine();
			
			db[i] = new Teacher(name,clg,age,subject,phno);
		}
		System.out.print("Do you want to see Teacher Information:(Yes-1,No-0)");
		int show = sc.nextInt();
		
		if(show==1)
		{
			for(int i=0;i<db.length;i++)
			{
				System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Thank you...");
		}
		sc.close();
	}
}
