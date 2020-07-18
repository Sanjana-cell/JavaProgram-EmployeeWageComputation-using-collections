/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {

	static int[] totalWages; //Stores total wages in a month
	
	public static void main(String[] args) {
		
		//Creates array with type CompanyEmpWage 
		CompanyEmpWage[] emp = new CompanyEmpWage[2];
		
		// Instantiate CompanyEmpWage object and stores it to arrays 
		emp[0]=new CompanyEmpWage(20, 20, 200, "Sharp");
		emp[1]=new CompanyEmpWage(50, 25, 200, "Sony");
		
		
		// Instantiate EmpWageBulider object
		EmpWageBulider emp1 = new EmpWageBulider(emp);
		
		totalWages=emp1.computeWage(); //calls computeWage() method from EmpWageBulider class 
		
	}
}
