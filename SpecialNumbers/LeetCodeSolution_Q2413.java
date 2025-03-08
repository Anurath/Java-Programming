class LeetCodeSolution_Q2413
{
	public int smallestEvenMultiple(int n) {
        byte num=2;
        for(int i=n;;i++)
        {
            if(i%2==0&&i%n==0)
            {
                return i;
            }
        }
    }
}