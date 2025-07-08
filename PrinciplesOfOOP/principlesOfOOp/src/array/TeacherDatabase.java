package array;
import java.util.*;
public class TeacherDatabase {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Teacher[] db = new Teacher[5];
		
		for(int i=0;i<db.length;i++)
		{
			System.out.println("Enter the name of teacher: ");
			String name = sc.nextLine();
			System.out.println("Enter the college name: ");
			String clg = sc.nextLine();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter Phone Number: ");
			long phno = sc.nextLong();
			String subject = sc.nextLine();
			
			db[i] = new Teacher(name,clg,age,subject,phno);
		}
		System.out.println("Do you want to see Teacher Information:(Yes-1,No-0)");
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
	}
}
