class LeetCodeSolution1920 {
    public boolean isThree(int n) {
        byte cnt=0;
        for(short i=1;i<=n;i++)
        {
            if(n%i==0)
                cnt++;
            if(cnt>3)
                return false;
        }
        return cnt==3?true:false;
    }
}