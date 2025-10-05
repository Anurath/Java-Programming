class LeetCodeSolution_Q3658 {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = (int)((n/2.0)*(4+(n-1)*2));
        int oddSum = evenSum-n;
        int temp = oddSum;
        while(temp!=1)
        {
            if(evenSum%temp==0&&oddSum%temp==0)
            {
                return temp;
            }
            temp--;
        }
        return 1;
    }
}