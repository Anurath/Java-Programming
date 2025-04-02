class Tree
{
	String name;
	int maxAge;
	String region;
	String size;
	public Tree displayName()
	{
		System.out.println("Name of Tree is: "+name);
		return this;
	}
	public Tree displayAge()
	{
		System.out.println("Tree max age: "+maxAge);
		return this;
	}
	public Tree displaySize()
	{
		System.out.println("Probable size of "+name+" is: "+size);
		return this;
	}
	public Tree displayRegion()
	{
		System.out.println("Sastainable region: "+region);
		return this;
	}
}