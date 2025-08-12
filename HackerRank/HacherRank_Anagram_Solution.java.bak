import java.util.Scanner;

public class HacherRank_Anagram_Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length())
        {
            String str1 = a.toLowerCase();
            String str2 = b.toLowerCase();
            int cnt=0;
            int[] ref = new int[a.length()];

            for(int i=0;i<a.length();i++)
            {
                for(int j=0;j<b.length();j++)
                {
                    if(ref[j]==0)
                    {
                        if(str1.charAt(i)==str2.charAt(j))
                        {
                            ref[j]=-1;
                            cnt++;
                            break;
                        }
                    }
                }
            }
            if(cnt==str1.length())
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}