package string;

public class DNARNAPattern {

	public static void main(String[] args) {
		String inp = "000001010011110";
		System.out.println(DNAMaker(inp));
	}
	
	public static String DNAMaker(String mol)
	{
		if(mol.length()%3==0&&mol.length()>2)
		{
			String inCode =""+mol.charAt(0)+mol.charAt(1)+mol.charAt(2);
			String ans="000";
			if(inCode.equals("000"))
			{
				int i=3;
				while(i<mol.length())
				{
					String temp="";
					for(int j=i;j<i+3;j++)
					{
						temp+=mol.charAt(j);
					}
					if(temp.equals("110"))
					{
						ans+="101";
					}
					else {
						ans+=temp;
					}
					i+=3;
				}
				return ans;
			}
			else {
				return "RNA";
			}
		}
		return "Not in proper format";
	}
}
