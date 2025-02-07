import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = (int)(a+Math.pow(2,0)*b);
            
            for(int j=0;j<n;j++)
            {
                if(n==0)
             {
                System.out.print(temp);
             }
            else{
                if(j==0)
                {
                    System.out.print(temp);
                }
                else{
                    temp=(int)(temp+Math.pow(2,j)*b);
					System.out.print(" ");
                    System.out.print(temp);
                }
             }
            }
             
        }
        in.close();
    }
}
 