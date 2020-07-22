import java.util.ArrayList;

/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {

	static int[] totalWages; //Stores total wages in a month
	
	public static void main(String[] args) {
		
		ArrayList<CompanyEmpWage> emp = new ArrayList<CompanyEmpWage>();
		
		emp.add(new CompanyEmpWage(8, 2, 2, "Sharp") );
		emp.add(new CompanyEmpWage(20, 20, 100, "Sony"));
			
		// Instantiate EmpWageBulider object
		EmpWageBulider emp1 = new EmpWageBulider(emp);
		
		totalWages=emp1.computeWage(); //calls computeWage() method from EmpWageBulider class 
		
	}
}
