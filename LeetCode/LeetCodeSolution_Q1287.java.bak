class LeetCodeSolution_Q1287{
    public int findSpecialInteger(int[] arr) {
        int[] count = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(count[i]!=-1)
            {
                int cnt=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count[j]=-1;
                        cnt++;
                    }
                }
                if(cnt>0.25*arr.length)
                {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}