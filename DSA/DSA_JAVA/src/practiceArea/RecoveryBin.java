package practiceArea;

public class RecoveryBin {

	
	private String[] db = {"Anurath","Ram","Akshay","Kunal"};
	private String[][] recoveryBin = new String[10][];
	
	private int savePoint = 0;
	public void addName(String name)
	{
		String[] temp = new String[db.length+1];
		
		for(int i=0;i<db.length;i++)
		{
			temp[i] = db[i];
		}
		temp[temp.length-1] = name;
		
		recoveryBin[savePoint] =db;
		savePoint++;
		db = temp;
	}
	
	public void showDB()
	{
		for(int i=0;i<db.length;i++)
		{
			System.out.println(db[i]);
		}
	}
	
	public void rollBack(int num)
	{
		if(savePoint>num)
		{
			db = recoveryBin[savePoint-num];
			savePoint--;
		}
	}
	
	public void removeName(String name)
	{
		int i;
		for(i=0;i<db.length;i++)
		{
			if(db[i].equals(name))
			{
				break;
			}
		}
		
		if(i<db.length)
		{
			String[] temp = new String[db.length-1];
			
			for(int j=0;j<db.length;j++)
			{
				if(j<i)
				{
					temp[j]=db[j];
				}
				else if(j>i)
				{
					temp[j-1] = db[j];
				}
			}
			
			recoveryBin[savePoint++] = db;
			
			db = temp;
		}
		else {
			System.out.println("Name not exist");
		}
	}
}
