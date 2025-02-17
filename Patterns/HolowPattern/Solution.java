import java.util.Scanner;
class Solution
{
    public static int main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
        int num = dividend;
        int cnt=0;
        boolean flag = false;
        if(num<0)
        {
            num=num*(-1);
            flag = true;
        }
        if(num<divisor)
        {
            return 0;
        }
        else
        {
        for(;;)
        {
            if(num >divisor)
            {
                cnt++;
                num-=divisor;
            }
            else
            {
                break;
            }
        }
        }
        if(flag)
        {
            int res = (-1)*cnt;
            return res;
        }
        else
        {
            return cnt;
        }
    }
}
