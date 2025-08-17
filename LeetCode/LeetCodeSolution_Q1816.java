class LeetCodeSolution_Q1816 {
    public String truncateSentence(String s, int k) {
        String ans = "";
        String[] ar = s.split(" ");
        for(int i=0;i<k;i++)
        {
            if(i<k-1)
            {
                ans+=ar[i]+" ";
            }
           else{
             ans+=ar[i];
           }
        }
        return ans;
    }
}