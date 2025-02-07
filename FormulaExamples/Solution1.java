import java.util.*;
import java.io.*;



class Solution1{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                }
                if(x<=32676&&x>=-32768){
                    System.out.println("* short");
                }
                if(x<=2147483647&&x>=-2147483648)
                {
                    System.out.println("* int");
                }
                if(x<=9223372036854775807L&&x>=-9223372036854775808L)
                {
                    System.out.println("* long");
                }
                
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



