package abstractclass;

public interface Ecomminterface {

	abstract void home();
	abstract void categories();
	
	//Ecomminterface(){} //doesnt accept constructors
	
	//void contactus() {}  // doesnt accept non abstract methods
	default void contactus() 
	{
		System.out.println("contact us with email or toll no");
		}
	
	}
