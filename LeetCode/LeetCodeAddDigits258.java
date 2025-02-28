class LeetCodeAddDigits258 {
    public int addDigits(int num) {
        byte sum = 0;
        byte rem=0;
       if(num<10)
            return num;
        for(;;)
        {
            for(int i=num;i>0;i/=10)
                 sum+=rem=(byte)(i%10);
            if(sum<10)
              return sum;
             else
            {
              num=sum;
              sum=0;
            }
       }
    }
}