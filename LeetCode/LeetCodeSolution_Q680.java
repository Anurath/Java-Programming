class LeetCodeSolution_Q680 {
    public boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return isPal(s,i,j-1)||isPal(s,i+1,j);
            }
        }
        return true;
    }

    public boolean isPal(String s, int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}