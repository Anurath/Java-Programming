class LeetCodeSolution_Q728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left;i<=right;i++)
        {
            int demo = i;
            boolean flag = true;
            while(demo!=0)
            {
                int rem = demo%10;
                if(rem!=0)
                {
                    if(i%rem!=0)
                {
                    flag =false;
                    break;
                }
                }
                else{
                    flag = false;
                    break;
                }
                demo/=10;
            }
            if(flag)
            {
                res.add(i);
            }
        }
        return res;
    }
}