package inheritance;

public class DoctorDriver {
	public static void main(String[] args)
	{
		Cardiologist c1 = new Cardiologist("Pradeep","Susan","MBBS",4,"Cardio","Heart");
		c1.displayDoctor();
		c1.displayCardiologist();
		System.out.println("----------------------------------");
		Neurologist n1 = new Neurologist("Satish","Susan","MBBS",3,"Neurology","Brain");
		n1.displayDoctor();
		n1.displayNeurologist();
	}
}
