package inheritance;

public class PersonDriver {
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("Sharad",40,8957492939l,123456789012l,"Math",15,80000,"Paranda");
		t1.displayPerson();
		t1.displayTeacher();
		
		System.out.println("------------------------");
		
		Student s1 = new Student("Anurath",22,9876543210l,987654321012l,4,"B.K","Math,English,Marathi,Hindi,History,Science",84.4);
		s1.displayPerson();
		s1.displayStudent();
	}
}
