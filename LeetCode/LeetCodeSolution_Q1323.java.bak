class LeetCodeSolution_Q1323{
    public int maximum69Number (int num) {
        int newNum=0;
        boolean flag=true;
        String s=num+"";
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(ch=='9')
            {
                newNum=newNum*10+9;
            }
            else
            {
                if(flag)
                {
                    newNum=newNum*10+9;
                    flag=false;
                }
                else
                {
                    newNum=newNum*10+6;
                }
            }
        }
        return newNum;
    }
}