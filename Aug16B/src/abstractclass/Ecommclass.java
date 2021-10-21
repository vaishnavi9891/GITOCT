package abstractclass;

public class Ecommclass implements Ecomminterface
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Ecommclass ec = new Ecommclass();
		ec.contactus();
		
	}
		public void contactus() 
		{
			System.out.println("contact us with email or toll no");
			}
		@Override
		public void home() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void categories() {
			// TODO Auto-generated method stub
			
		}
	
	}
