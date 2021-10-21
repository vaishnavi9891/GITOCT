package method_ex;

public class methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methods obj=new methods();
		obj.printchar('N');
		//char value=obj.printchar('M'); this is wrong
		obj.addnumbers();
		int dynamicnumber= obj.retnum();
		int totalsum = obj.sumofnos(dynamicnumber);
		System.out.println("the total sum of numbers is " + totalsum);
	}
void printchar(char value)
	
	{
		System.out.println("print a character" + value );
	
	}
	
void addnumbers() //void method
{
	
}
int sumofnos(int dynamicno)// datatype methor=d

{
	int fixedno = 100;
	int totalsum = fixedno + dynamicno;
	return totalsum;

}

	int retnum() 
	{
	return 550;
}

}