package constructor_ex;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiply obj = new multiply();
		obj.memp();
		obj.multiplication(0, 0);
		/*
		 * multiply obj2 = new multiply(5, 6);// we can call the same constructor again
		 * with diff object name multiply obj3 = new multiply("sample", 1); multiply
		 * obj4 = new multiply(2, "nd sample"); multiply obj5 = new multiply(2.5,
		 * " percentile");
		 */
	}

	void memp() {
		System.out.println("memp method used for method overriding in class Emp_add");
	}

	int multiplication(int a, int b) {
		// int a= 3;
		// int b= 4;
		// int c = a*b;
		return (20);
	}
	
	public multiply() {
		// TODO Auto-generated constructor stub
		System.out.println("simple constructor");
	}

	
	  multiply(int a, int b, int c)// try overloading with diff parameters
	  { int d
	  = a * a * b * b * c * c; System.out.println("print " + d); }
	  
	  //multiply(int a,int b,int c)//throws an error as duplicate method
	  
	  multiply(int a, int b) { int c = a * b; System.out.println("result is " + c);
	  }
	  
	  multiply(String name, int a) { System.out.println(name + a); }
	  
	  multiply(int a, String name) { System.out.println(a + name); }
	  
	  multiply(double a, String b) { System.out.println(a + b); }
	 
}