/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {
	
	final static int WAGE_PER_HOUR=20; //Assigned wage per hour as 20
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*3); // Generates 0,1 or 2 using random() and stores the value
		
		//Checks if Employee is present or absent
		if(attendence==1) {
			System.out.println("Employee is Present");
			workHours=8;
			dailyWage=workHours*WAGE_PER_HOUR;
		}
		else if(attendence==1) {
			System.out.println("Employee is Present for Part Time");
			workHours=4;
			dailyWage=workHours*WAGE_PER_HOUR;
		}
		else
			System.out.println("Employee is Absent");
		
		System.out.println("Daily Wage of an Employee "+dailyWage);

	}

}
