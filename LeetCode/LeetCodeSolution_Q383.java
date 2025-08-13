class LeetCodeSolution_Q383{
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()<=magazine.length())
		{
			int[] ref = new int[magazine.length()];

			for(int i=0;i<ransomNote.length();i++)
			{
				boolean flag = true;
				for(int j=0;j<magazine.length();j++)
				{
					if(ref[j]!=-1)
					{
						if(ransomNote.charAt(i)==magazine.charAt(j))
						{
							flag = false;
							ref[j]=-1;
							break;
						}
					}
				}
				if(flag)
				{
					return false;
				}
			}
			return true;
		}
		return false;
    }
}