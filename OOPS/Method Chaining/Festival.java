class Festival
{
	String name;
	int month;
	String otherName;
	String festFood;
	String region;
	public Festival displayName()
	{
		System.out.println("Festal Name: "+name);
		return this;
	}
	public Festival displayMonth()
	{
		System.out.println("Celebration month: "+month);
		return this;
	}
	public Festival displayFood()
	{
		System.out.println("Festival food: "+festFood);
		return this;
	}
	public Festival displayRegion()
	{
		System.out.println("Region: "+region);
		return this;
	}
}