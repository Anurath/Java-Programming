class LeetCodeSolution_Q1025 {
    public boolean divisorGame(int n) {
        int cnt = 0;
        while(n!=1)
        {
            cnt++;
            n=n-1;
        }
        if(cnt%2==1)
        {
            return true;
        }
        else{
            return false;
        }
    }
}