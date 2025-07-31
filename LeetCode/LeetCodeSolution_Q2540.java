class LeetCodeSolution_Q2540{
    public int getCommon(int[] nums1, int[] nums2) {
        int[] max = nums1.length>nums2.length?nums1:nums2;
        int[] min = nums1.length>nums2.length?nums2:nums1;

        for(int i=0;i<min.length;i++)
        {
            for(int j=0;j<max.length;j++)
            {
                if(min[i]==max[j])
                {
                    return min[i];
                }
                if(min[i]<max[j])
                {
                    break;
                }
            }
        }
        return -1;
    }
}