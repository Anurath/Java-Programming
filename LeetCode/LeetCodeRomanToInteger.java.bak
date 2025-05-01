class LeetCodeRomanToInteger
{
    public int romanToInt(String s)
		{
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int num = 0,op=0,opP=0,currRoman=0,preRoman=0;
        for(byte i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            switch(ch)
            {
                case 'I':
                {
                    op=1;
                    break;
                }
                case 'V':
                {
                    op=5;
                    break;
                }
                case 'X':
                {
                    op=10;
                    break;
                }
                case 'L':
                {
                    op=50;
                    break;
                }
                case 'C':
                {
                    op=100;
                    break;
                }
                case 'D':
                {
                    op=500;
                    break;
                }
                case 'M':
                {
                    op=1000;
                    break;
                }
            }
            if(i>0)
            {
             char ch1 = s.charAt(i-1);
             switch(ch1)
             {
                case 'I':
                {
                    opP=1;
                    break;
                }
                case 'V':
                {
                    opP=5;
                    break;
                }
                case 'X':
                {
                    opP=10;
                    break;
                }
                case 'L':
                {
                    opP=50;
                    break;
                }
                case 'C':
                {
                    opP=100;
                    break;
                }
                case 'D':
                {
                    opP=500;
                    break;
                }
                case 'M':
                {
                    opP=1000;
                    break;
                }
             }
            }
            preRoman=opP;
            currRoman = op;
            if(preRoman<currRoman)
                num+=(currRoman-2*preRoman);
            else
                 num+=op;
        }
        return num;
    }
}
