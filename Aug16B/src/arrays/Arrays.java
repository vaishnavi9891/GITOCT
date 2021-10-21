package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rollno = {2,4,8,6,16,12,14,10};
		// array index value starts from 0 ie; 0=2,1=4.7=16
		
		System.out.println(rollno[1]);
		System.out.println(rollno[6]);
		
		System.out.println(rollno.length);// total index values 8
		
		//for(int i=0;i<=rollno;i++) there is no value in index 8 , throws runtime error
		for(int i=0; i<rollno.length ;i++)
		{
			System.out.println(rollno[i]); // displays array 
		}
		
		System.out.println("=="+rollno.length);
	
		for(int i=rollno.length-1; i>=0 ;i--) //i<=0
		{
			System.out.println(rollno[i]); // displays array in reverse
	
		}
		
		
	}

}
