package encapsulation;

public class Amazon_Customer {
			
		public String CustomerName = "ANIL";
		public int CustomerID = 135;
		
		public static void main(String[] args)
		{
			Amazon_Customer obj = new Amazon_Customer();
			obj.display();
		}
		public void display()
		{
			System.out.println("Customer name is " +CustomerName);
			System.out.println("Customer ID is " +CustomerID);
		}
		
	}

