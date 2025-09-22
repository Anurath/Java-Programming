class LeetCodeSolution_Q2806 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem = purchaseAmount%10;
        if(rem>=5)
        {
            rem=10;
        }
        else{
            rem =0;
        }

        return 100-((purchaseAmount/10)*10+rem);
    }
}