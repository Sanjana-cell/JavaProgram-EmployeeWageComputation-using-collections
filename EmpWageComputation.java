/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {
	
	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	static int totalWorkingDays=1; //Stores total working days of an employee in month
	static int totalWages=0; //Stores total wages in a month
	static int totalWorkingHrs=0; //Stores total working hours of an employee in month
	static String company=""; //Stores Company name

	//Computes Total Wages  of an Employee in month
	public static int ComputeWage(int wage_per_hour, int max_working_days, int max_working_hours, String company) {
	
		EmpWageComputation.company=company;
		//Continues till totalWorkings days reached maximum working days
		while(totalWorkingDays<=max_working_days || totalWorkingHrs<=max_working_days) {
			int attendence = (int)(Math.random()*3); // Generates 0 or 1 using random() and stores the value
		
			/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
				according to work time*/
			switch(attendence) {
			case FULL_TIME: workHours=8;
							break;
						
			case PART_TIME: workHours=4;
							break;
						
			default:		workHours=0;
		
			}
			dailyWage=workHours*wage_per_hour; //Calculates daily wages
			totalWorkingHrs+=workHours; //Increments by workHours
			System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
			totalWorkingDays++;
		}
		return totalWorkingHrs*wage_per_hour; //Calculates and returns total wages in month
	}
	
	public static void main(String[] args) {
		
		//Calls class method computeWage with different parameters and assigns return value to totalWages
		totalWages=EmpWageComputation.ComputeWage(20, 3, 10, "sharp");	
		System.out.println("Total wages of Employee in "+EmpWageComputation.company+" Company ="+totalWages);
		
		totalWages=EmpWageComputation.ComputeWage(20, 20, 100, "Sony");	
		System.out.println("Total wages of Employee in "+EmpWageComputation.company+" Company ="+totalWages);		
		
	}
}
