package method_ex;

public class college {
	
	int a = 10;
	
	int bonus(int salary)//25k from LecSalaries-> lecSalary -> 25k as assigned as the dynamic value of the salary in bonus method
	{
		int bonusToEmp = 10000;
		int tot_Salary = bonusToEmp + salary;
		return tot_Salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		college obj = new college();
			
			int lecSalary = obj.LecSalaries();// 25000 is called from LecSalaries to lecsalary
			
			System.out.println("Lec salary is " + lecSalary);// it returns 25000
			
			int tot_Salary = obj.bonus(lecSalary);//lecSalary is assigned to bonus
			System.out.println("Total salary is with Bonus is  " + tot_Salary );
			
			String collegeName = obj.nameOfTheCollege();
			System.out.println("Name of the college is  " + collegeName);
		}
		
		String nameOfTheCollege() {
			String name = "MallaReddy Engg College";
			return name;
		}
		
		int LecSalaries() {
			return 25000;
		}
		
		
	}
