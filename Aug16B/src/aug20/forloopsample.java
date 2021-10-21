package aug20;

public class forloopsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  str = "practice";
for(int i=1;i<=5;i++)//increments use int less than max limit value
{
System.out.println(str);
}
System.out.println();

for(int i=5;i>=1;i--)//decrement use int greater than minimum limit value
{
System.out.println(str);
}

System.out.println();

for (int i=1;i<=5;i++)
{
	System.out.println(i*2);//prints 1*2 ,2*2, 3*2..5*2
}
	System.out.println();
	
	int table = 5;
		for(int i=1; i<=10; i++) 
		{
			System.out.println(table*i);//prints 5*1, 5*2..5*10
		}
		System.out.println();
		
		int addition = 5;
		for(int i=1; i<=10; i++) 
		{
			System.out.println(addition+i);//prints 5+1, 5+2..5+10
		}
		
System.out.println();
		
		int addtwo = 5;
		for(int i=5; i>=0; i--) 
		{
			System.out.println(addtwo+i);//prints 5+5, 5+4..5+0
		}
		
		
	}

}
