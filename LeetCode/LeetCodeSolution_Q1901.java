class LeetCodeSolution_Q1901 {
    public int[] findPeakGrid(int[][] mat) {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(j-1>=0)
                {
                    if(mat[i][j]<=mat[i][j-1])
                    {
                        continue;
                    }
                }
                if(i-1>=0)
                {
                    if(mat[i][j]<=mat[i-1][j])
                    {
                        continue;
                    }
                }
                if(j+1<mat[i].length)
                {
                    if(mat[i][j]<=mat[i][j+1])
                    {
                        continue;
                    }
                }
                if(i+1<mat.length)
                {
                    if(mat[i][j]<=mat[i+1][j])
                    {
                        continue;
                    }
                }
                    int[] ans = {i,j};
                    return ans;
            }
        }
        return null;
    }
}