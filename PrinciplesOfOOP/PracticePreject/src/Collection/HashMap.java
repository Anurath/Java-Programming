package Collection;

import hashset.LinkedList;

public class HashMap {

	private int size = 16;
	private int threshHold = 0;
	
	private LinkedList[] arr = new LinkedList[size];
	
	public HashMap() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean add(Object val)
	{
		int hashCode = val.hashCode();
		int idx = hashCode%size;
		if(arr[idx]==null)
		{
			arr[idx] = new LinkedList();
			
			threshHold++;
			
			if(threshHold>=size*0.76)
			{
				resize();
				arr[idx].addVal(val);
			}
			else {
				arr[idx].addVal(val);
			}
		}
		else {
			arr[idx].addVal(val);
		}

		return true;
	}
	
	public boolean resize()
	{
		LinkedList[] temp = new LinkedList[size*2];
		for(int i = 0 ;i<arr.length;i++)
		{
			temp[i] = arr[i];
		}
		arr = temp;
		size = size*2;
	    
		return true;
	}
	
	public String toString()
	{
		String ans = "";
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				ans = ans + arr[i].toString();
			}
		}
		return ans;
	}
}
