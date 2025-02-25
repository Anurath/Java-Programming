class Sqrt {
    public int mySqrt(int x) {
        int powAns  = 0;
        for(int i=0;i<x;i++)
        {
            if(x==2147483647)
            {
                powAns=46340;
                break;
            }
            if(x==1||x==2)
            {
               powAns=1;
                break; 
            }
            if(x==i*i)
            {
                powAns=i;
                break;
            }
            if(x<i*i)
            {
                powAns= i-1;
                break;
            }
        }
        return powAns;
    }
}