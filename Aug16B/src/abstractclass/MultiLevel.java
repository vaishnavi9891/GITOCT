package abstractclass;

public class MultiLevel implements Ecomminterface1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel mul= new MultiLevel();
		mul.Mens_Clothing();// no statements are given in parent or child interface
		mul.Womens_Clothing();// no statements are given in parent or child interface
		mul.Babies_Clothing();
		mul.Offers();
	}

	@Override
	public void Mens_Clothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Womens_Clothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Offers() {
		// TODO Auto-generated method stub
		System.out.println("No active offers now");
	}

}
