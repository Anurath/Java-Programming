package practice;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Student> s1 = new ArrayList<Student>();
		
		s1.add(new Student(1,"Anurath",23,"PK",2025));
		s1.add(new Student(1,"Kunal",22,"SP",2025));
		s1.add(new Student(1,"Anket",22,"BK",2025));
		s1.add(new Student(1,"Sanket",21,"DY",2025));
		s1.add(new Student(1,"Ram",20,"FC",2025));
		s1.add(new Student(1,"Anurath",23,"PK",2023));
		s1.add(new Student(1,"Anurath",29,"PK",2025));
		s1.add(new Student(1,"Anurath",23,"PK",2024));
		s1.add(new Student(1,"Karan",23,"MC",2025));
		s1.add(new Student(1,"Harsh",25,"JC",2025));
		s1.add(new Student(1,"Mohit",25,"PK",2025));
		
//		System.out.println(s1);
		
//		Collections.sort(s1);
		
//		System.out.println(s1);
		
		Collections.reverse(s1);
		
		System.out.println(s1);
		
		System.out.println(Collections.max(s1));
		
		System.out.println(Collections.min(s1));
		
		System.out.println(Collections.frequency(s1,new Student(1,"Anurath",23,"PK",2025) ));
	}
}
