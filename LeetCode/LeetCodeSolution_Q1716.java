class LeetCodeSolution_Q1716 {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int weekday = 1;
        int incWeek = 0;
        for(int i=1 ;i<=n;i++)
        {
            totalMoney = incWeek+weekday+totalMoney;
			if(weekday==7)
            {
                incWeek++;
                weekday=0;
            }
			weekday++;
        }
        return totalMoney;
    }
}