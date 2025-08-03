package arraysProblems;

public class ArrayLengthWithoutLenghVariable {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,6,7,8,5,4};
		int len = 0;
		
		while(true)
		{
			try {
				int a  = arr[len++];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				break;
			}
		}
		System.out.println(len);
	}
}
