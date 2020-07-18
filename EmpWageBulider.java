
public class EmpWageBulider {

	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	public int wage_per_hour;
	public int max_working_days;
	public int max_working_hours; 
	int dailyWage=0;	 //Stores dailyWage of employee
	int workHours=0;  //Stores work hour of employee
	int totalWorkingDays=1; //Stores total working days of an employee in month
	int totalWages=0; //Stores total wages in a month
	int totalWorkingHrs=0; //Stores total working hours of an employee in month
    String company=""; //Stores Company name
	public EmpWageBulider(int wage_per_hour, int max_working_days, int max_working_hours, String company) {
		super();
		this.wage_per_hour = wage_per_hour;
		this.max_working_days = max_working_days;
		this.max_working_hours = max_working_hours;
		this.company = company;
	}
	
	public int computeWage() {
		//Continues till totalWorkings days reached maximum working days
		while(totalWorkingDays<=max_working_days || totalWorkingHrs<=max_working_hours) {
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
			totalWorkingHrs+=workHours; //Increments by workHours
			dailyWage=workHours*wage_per_hour;
			System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
			totalWorkingDays++;
		}
		return totalWorkingHrs*wage_per_hour; //Calculates and returns total wages in month
	}

	@Override
	public String toString() {
		return company;
	}
	
	
}
