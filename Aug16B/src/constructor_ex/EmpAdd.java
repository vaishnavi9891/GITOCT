package constructor_ex;

public class EmpAdd extends multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpAdd override = new EmpAdd();
		//EmpAdd override1 = new EmpAdd();

		override.add();
		override.memp();

	}

	
	
	
	/*
	 * EmpAdd(){ int a = 10; int b = 20; int c = a + b;
	 * System.out.println("sum of a and b is " + c); }
	 */
	void memp()

	{
		System.out.println("multiplyemp method is method overridden in class Emp_add");
	}

	void add() {
		System.out.println("perform addition");
		//super.memp();

	}

}
