package encapsulationPackage;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Anurath","P K Technical Campus Chakan",54321,"anurath@gmail.com",9876543210L,"a@1234");
		
		System.out.println(s1.getCollage());
		System.out.println(s1.getPRN());
		System.out.println(s1.getStudent());
		
		s1.setPassword("anurath@gmail.com",9876543210L,"a@1234","p@1234");
		
	}
}
