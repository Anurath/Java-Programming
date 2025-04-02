class TreeDriver
{
	public static void main(String[] args)
	{
		Tree t1=new Tree();
		t1.name="Neem";
		t1.maxAge=150;
		t1.size="Medium";
		t1.region="Deccan India";
		t1.displayName().displayAge().displaySize().displayRegion();
	}
}