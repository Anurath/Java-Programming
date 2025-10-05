class LeetCodeSolution_Q378 {
    public int firstUniqChar(String s) {
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
           if(sb.charAt(i)!='#')
           {
                char ch = sb.charAt(i);
                boolean flag = true;
                for(int j=i+1;j<s.length();j++)
                {
                    if(ch==sb.charAt(j))
                    {
                        flag = false;
                        sb.setCharAt(j,'#');
                    }
                }
                if(flag)
                {
                    return i;
                }
           }
        }
        return -1;
    }
}