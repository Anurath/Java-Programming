class LeetCodeSolution_Q1351{
    public int countNegatives(int[][] grid) {
        int cnt = 0 ;
        for(int i=0;i<grid.length;i++)
        {
            int[] ref = grid[i];
            for(int j=ref.length-1;j>=0;j--)
            {
                if(ref[j]<0)
                {
                    cnt++;
                }
                else
                {
                    break;
                }
            }
        }
        return cnt;
    }
}