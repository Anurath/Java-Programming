class LeetCodeSolution_Q1832 {
    public boolean checkIfPangram(String sentence) {
        int cnt=0;
            int[] ref = new int[26];

            for(int i=0;i<sentence.length();i++)
            {
                int n = sentence.charAt(i)-97;
                if(ref[n]!=-1)
                {
                    ref[n]=-1;
                    cnt++;
                }
            }
			for(int i=0,j=25;i<j;i++,j--)
			{
				if(ref[i]!=-1)
				{
					return false;
				}
                if(ref[j]!=-1)
				{
					return false;
				}
			}
			return true;
    }
}