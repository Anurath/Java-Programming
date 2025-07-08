package array;
import java.util.*;
public class TeacherDatabase {

	public static void main(String[] args)
	{
		Teacher[] db = new Teacher[5];
		
		for(int i=0;i<db.length;i++)
		{
			Scanner sc = new Scanner(System.in);
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
	}
}
