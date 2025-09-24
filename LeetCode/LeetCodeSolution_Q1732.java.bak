class LeetCodeSolution_Q1732{
    public int largestAltitude(int[] gain) {
        int maxAlt = gain[0],ref=maxAlt;
        for(int i=1;i<gain.length;i++)
        {
			ref+=gain[i];
            if(ref>maxAlt)
            {
                maxAlt=ref;
            }
        }
        return maxAlt>0?maxAlt:0;
    }
}