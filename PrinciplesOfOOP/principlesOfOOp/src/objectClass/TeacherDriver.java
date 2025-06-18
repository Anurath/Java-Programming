package objectClass;

public class TeacherDriver {
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("Ram",35,"Math","Bed",12);
		Teacher t2 = new Teacher("Ram",35,"Math","Bed",12);
		
		System.out.println(t1==t2);
		
		System.out.println(t1.equals(t2));
	}
}
