package practiceArea;

public class Test {

	public static void main(String[] args) {
		String s = "abcc";
		System.out.println(equalFrequency(s));
	}
	
	public static boolean equalFrequency(String word) {
        
        int[] fer = new int[word.length()];
        
        for(int i=0;i<fer.length;i++)
        {
        	if(fer[i]!=-1)
        	{
        		int cnt = 0;
        		for(int j=i+1;j<fer.length;j++)
        		{
        			if(word.charAt(i)==word.charAt(j))
        			{
        				cnt++;
        				fer[j]=-1;
        			}
        		}
        		
        		fer[i]=cnt;
        	}
        }
        
        for(int i=0;i<fer.length;i++)
        {
        	System.out.print(fer[i]+" ");
        }
        	return true;
    }
}
