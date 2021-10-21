package finalthiskeyword;

public class Retailstore 
{
	String franchise = "RELIANCE";

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Retailstore rs1= new Retailstore();
		rs1.chain("RELIANCE MART");
		
	}

	Retailstore()// passing final keyword in the class constructor
	{	
		
		final String franchise1 = "RELIANCE FOOTPRINT";
		System.out.println(franchise1+ " has footwear");
// this wont execute once final is assigned		//franchise="";
		//System.out.println(franchise + " has many outlets");
		
		}
	
	public void chain(String franchise)
	{
		System.out.println(franchise+" has groceries");
		System.out.println(this.franchise+" has many outlets");
	
	}
	void headquarters()
	{
		System.out.println("Headquarters is in Mumbai");
	}	
}
