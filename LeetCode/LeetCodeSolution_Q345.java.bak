class LeetCodeSolution_Q345 {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();

        int j = ch.length-1;

        for(int i=0;i<j;i++)
        {
            if(isOvel(ch[i]))
            {
                while(j>i)
                {
                    if(isOvel(ch[j]))
                    {
                        char temp = ch[i];
                        ch[i] = ch[j];
                        ch[j]=temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
        }
        return new String(ch);
    }

    public boolean isOvel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            return true;
        }
        return false;
    }
}