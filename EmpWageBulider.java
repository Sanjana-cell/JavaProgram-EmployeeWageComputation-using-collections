import java.util.ArrayList;
import java.util.Arrays;

public class EmpWageBulider {

	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	
	int dailyWage=0;	 //Stores dailyWage of employee
	int workHours=0;  //Stores work hour of employee
	int totalWorkingDays=0; //Stores total working days of an employee in month
	int totalWorkingHrs=0; //Stores total working hours of an employee in month
    
	String company=""; //Stores Company name
	ArrayList<CompanyEmpWage>  info; //ArrayList declaration 
    int totalWages[] = new int[2];
    
    
	public EmpWageBulider(ArrayList<CompanyEmpWage> info) {
		this.info=info;
		
	}


	//Calculates total Wages of an employee of different companies for totalWorking days and totalWorking hours
	public int[] computeWage() {
		int i=0;
		for(CompanyEmpWage info: info) {
			System.out.println(info.company + " Employee Daily Wages");
			//Continues till totalWorkings days reached maximum working days
			while(totalWorkingDays<=info.max_working_days || totalWorkingHrs<=info.max_working_hours) {
				int attendence = (int)(Math.random()*3); // Generates 0 or 1 using random() and stores the value
		
				/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
					according to work time*/
				switch(attendence) {
					case FULL_TIME: workHours=8;
							break;
						
					case PART_TIME: workHours=4;
							break;
						
					default:	workHours=0;
		
				}
				totalWorkingHrs+=workHours; //Increments by workHours
				dailyWage=workHours*info.wage_per_hour;
				System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
				totalWorkingDays++;
			}
			
			totalWages[i]=totalWorkingHrs*info.wage_per_hour;; //Calculates and returns total wages in month
			System.out.println();
			System.out.println("Total Wages in "+ info.company + " is "+ totalWages[i]);
			i++;
			System.out.println();
			totalWorkingDays=0;
			totalWorkingHrs=0;
		}
		return totalWages;
	}
}
