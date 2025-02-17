class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int index=0;
        int index1=0;
        boolean flag= false;
        for(int i=0;i<len;i++)
        {
            int element = nums[i];
            if(element==target)
            {
                index=i;
                flag = true;
                break;
            }
        }
        for(int i=0;i<len;i++)
        {
            int element = nums[i];
            if(target<element)
            {
                index1=i;
                System.out.println(i);
                break;
            }
            else
                index1=i+1;
        }
        if(flag)
            return index;
        else
            return index1;
    }
}