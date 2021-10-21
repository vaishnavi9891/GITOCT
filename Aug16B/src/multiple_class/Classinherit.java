package multiple_class;

public class Classinherit extends inventory_depstore{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("simple class for inheritence");
inventory_store(1,2,3);
	}
//Classinherit c1=new Classinherit();
static void inventory_store(int storemanager1,int storemanager2, int storemanager3)
{	
	System.out.println("billing manager "+storemanager1 );
	System.out.println("inventory manager "+storemanager2 );
	System.out.println("customer manager "+storemanager3 );
}	
	}

////class inheritclass2 extends Classinherit
//{
//	void inventory_stores()
//	{	
//	
//	inheritclass2 c2 = new inheritclass2();
//	//System.out.println(super.inventory_store);
//	c2.inventory_store(7,8,9);
//		//System.out.println("billing manager "+storemanager1 );
//		//System.out.println("inventory manager "+storemanager1 );
//		//System.out.println("customer manager "+storemanager1 );
//	}
//}