class LeetCodeSolution_Q3232{
    public boolean canAliceWin(int[] nums) {
        int maxNum=0,minNum=0;
		for (byte i=0;i<nums.length;i++)
		{
            byte num=(byte)nums[i];
			if (num<10)
			{
				minNum+=num;
			}
			else
			{
				maxNum+=num;
			}
		}
		return !(maxNum==minNum);
    }
}