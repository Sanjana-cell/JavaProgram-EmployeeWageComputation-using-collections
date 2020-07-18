/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {
	
	final static int WAGE_PER_HOUR=20; //Assigned wage per hour as 20
	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*3); // Generates 0,1 or 2 using random() and stores the value
		
		/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
		  according to work time*/
		switch(attendence) {
		case FULL_TIME: System.out.println("Employee is Present Full Time");
						workHours=8;
						break;
						
		case PART_TIME: System.out.println("Employee is Present Part Time");
						workHours=4;
						break;
						
		default:	System.out.println("Employee is Absent");
		
		}
		dailyWage=workHours*WAGE_PER_HOUR;
		
		System.out.println("Daily Wage of an Employee "+dailyWage);

	}

}
