class LeetCodeSolution_Q2053{
    public String kthDistinct(String[] arr, int k) {
        int[] count = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(count[i]!=-1)
            {
                int cnt=0;
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[i].equals(arr[j]))
                    {
                        cnt++;
                        count[j]=-1;
                    }
                }
                if(cnt==1)
                {
                    k--;
                }
                if(k==0)
                {
                    return arr[i];
                }
            }
        }
        return "";
    }
}