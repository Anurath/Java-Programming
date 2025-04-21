class LeetCodeSolution_Q1925{
    public int countTriples(int n) {
       int cnt = 0;
	   for (int k=1;k<=n;k++)
	   {
		   for (int i=1;i<k;i++)
		   {
				for (int j=1;j<k;j++)
			   {
				   if (i!=j)
				   {
					 if ((i*i)+(j*j)==k*k)
					 {
					   cnt++;
				     }
			       }
		        }
		    }
	   }
	   return cnt;
    }
}