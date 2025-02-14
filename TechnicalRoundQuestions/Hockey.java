import java.util.Scanner;
class Hockey
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter team sequence : ");
		String seq = sc.next();
		int len = seq.length();
		boolean flag = true;
		int teamA = 0;
		int teamB= 0;
		for (int i =0;i<len ;i++ )
		{
			char ch = seq.charAt(i);
			if (ch=='0')
			{
				teamA++;
				teamB=0;
			}
			else
			{
				teamB++;
				teamA=0;
			}
			if (teamA==7||teamB==7)
			{
				System.out.println("YES");
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("No");
		}
	}
}