class LeetCodeSolution_Q1295{
    public int findNumbers(int[] nums) {
      short cnt=0;
      for(int i=0;i<nums.length;i++)
      {
        byte digitCnt=0;
        for(int j=nums[i];j!=0;j/=10)
        {
           digitCnt++;
        }
        if(digitCnt%2==0)
        {
            cnt++;
        }
      } 
      return cnt; 
    }
}