package array;

public class StudentDataBase {

	public static void main(String[] args)
	{
		Student[] db = new Student[4];
		
		db[0] = new Student("Anurath","PK",22,4156);
		db[1] = new Student("Kunal","PK",21,4139);
		db[2] = new Student("Sanket","PK",22,4106);
		db[3] = new Student("Ram","PK",23,4149);
		
		for(int i=0;i<db.length;i++)
		{
			System.out.println(db[i]);
		}
	}
}
