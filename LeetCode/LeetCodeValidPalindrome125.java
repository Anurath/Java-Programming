class Solution {
    public boolean isPalindrome(String s) {
         String a = s.toLowerCase();
        boolean flag =true;
        String newStr = "";
        char ch = '\u0000';
        for(int i=0;i<a.length();i++)
        {
            ch = a.charAt(i);
            if(ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=48&&ch<=57)
                newStr+=ch;
        }
        for(int i=0;i<newStr.length()/2;i++)
            if(newStr.charAt(i)!=newStr.charAt(newStr.length()-1-i))
                flag =false;
        if(flag)
            return true;
        else
            return false;
    }
}