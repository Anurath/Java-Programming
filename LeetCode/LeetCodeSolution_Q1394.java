class LeetCodeSolution_Q1394{
    public int findLucky(int[] arr) {
        int maxPos=0;
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            int cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==num)
                {
                    cnt++;
                }
            }
            if(num==cnt)
            {
                if(maxPos<cnt)
                {
                    maxPos=cnt;
                }
            }
        }
        return maxPos==0?-1:maxPos;
    }
}