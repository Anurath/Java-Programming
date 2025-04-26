package CombineAggregationAndComposition;
import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args)
	{
		Student s1 = new Student("Sandeep","sandip@gmail.com",323,"Engineering",1987);
		Student s2 = new Student("Ram","ram@gmail.com",223,"BA",1989);
		Student s3 = new Student("Akshay","akshay@gmail.com",678,"BCOM",1993);
		Student s4 = new Student("Love","love@gmail.com",679,"BCOM",1993);
		Student s5 = new Student("Kush","kush@gmail.com",680,"BCA",1994);
		Student s6 = new Student("Vikram","vikram@gmail.com",5180,"BCOM",1995);
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		for(Student ele:studentList)
		{
			ele.displayStudent();
		}
	}
}
