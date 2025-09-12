class LeetCodeSolution_Q14{
    public String longestCommonPrefix(String[] strs) {
        String temp =strs[0];
        String ans="";
        boolean flag =false;
        for(int i=0;i<temp.length();i++)
        {
            for(int j=0;j<strs.length;j++)
            {
               if(i<strs[j].length())
               {
                 if(temp.charAt(i)!=strs[j].charAt(i))
                 {
                    flag=true;
                    break;
                 }
               }
               else{
                flag=true;
                    break;
               }
            }
            if(flag)
            {
                break;
            }
            ans+=temp.charAt(i);
        }
        return ans;
    }
}