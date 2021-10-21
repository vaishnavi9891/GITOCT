package abstractclass;

public class Multiple_inheritence_Class implements Ecomminterface2,Ecomminterface3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_inheritence_Class mic= new Multiple_inheritence_Class();
		mic.Mens_Clothing();
		mic.Womens_Clothing();
		mic.hq();// called from Ecomminterface2
		mic.Categories();//called from Ecomminterface2
	}

	@Override
	public void Mens_Clothing() {
		// TODO Auto-generated method stub
		System.out.println("Mens Clothing is available");
	}

	@Override
	public void Womens_Clothing() {
		// TODO Auto-generated method stub
		
	}
	}
