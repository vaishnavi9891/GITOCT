package statickeyword_ex;

public class depstore {
	
	static final String franchise = "RELIANCE";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("data from static void main block");
		depstore dept = new depstore();
		dept.chain();
		depstore.deptinfo(2, "ECIL", "Convenience");
		depstore.deptinfo(6, "BHEL", "Convenience");
		depstore.deptinfo(8, "UPPAL", "Convenience");// an object cannot call a static method
	}
	static void deptinfo (int branchno, String branchname, String storetype)
	{
		System.out.println("Branch No : " + branchno);
		System.out.println("Branch Name : " + branchname);
		System.out.println("Store Type : " + storetype);
		System.out.println("Franchise : " + depstore.franchise);
	}

	//class 2
	static class billing // nested class
	{
	static void bill()
	{
		System.out.println("billing section from a nested static class");
	}
	
	static
	{
		System.out.println("static block");
	}
	}
	public void chain()
	{	
		final String franchise = "RELIANCE MART";
		System.out.println(franchise+ " has groceries");
		
	}
}