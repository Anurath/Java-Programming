class LeetCodeSolution_Q3280{
    public String convertDateToBinary(String date) {
        byte d=Byte.parseByte(date.substring(8,10));
        byte m=Byte.parseByte(date.substring(5,7));
        int y=Integer.parseInt(date.substring(0,4));
        String dRes="";
        String mRes="";
        String yRes="";
        for(byte i=d;i!=0;i/=2)
        {
            if(i%2==0)
            {
                dRes=0+dRes;
            }
            else
            {
                dRes=1+dRes;
            }
        }
        for(byte i=m;i!=0;i/=2)
        {
            if(i%2==0)
            {
                mRes=0+mRes;
            }
            else
            {
                mRes=1+mRes;
            }
        }
        for(int i=y;i!=0;i/=2)
        {
            if(i%2==0)
            {
                yRes=0+yRes;
            }
            else
            {
                yRes=1+yRes;
            }
        }
        return yRes+"-"+mRes+"-"+dRes;
    }
}