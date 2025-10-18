class LeetCodeSolution_Q1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] ch = brokenLetters.toCharArray();
        String[] arr = text.split(" ");
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<ch.length;j++)
            {
                if(arr[i].contains(ch[j]+""))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                cnt++;
            }
        }
        return cnt;
    }
}