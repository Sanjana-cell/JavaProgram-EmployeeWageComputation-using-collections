/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {
	

	static int totalWages=0; //Stores total wages in a month
	
	public static void main(String[] args) {
		
		// Instantiate EmpWageBulider object
		EmpWageBulider emp1 = new EmpWageBulider(20, 20, 200, "Sharp");
		EmpWageBulider emp2 = new EmpWageBulider(15, 30, 200, "Sony");
		
		totalWages=emp1.computeWage(); //calls computeWage() method from EmpWageBulider class and assigns return value to totalWages 
		System.out.println("Total Wages for an Employee in "+emp1+" is "+totalWages);
		System.out.println();
		
		totalWages=emp2.computeWage();
		System.out.println();
		System.out.println("Total Wages for an Employee in "+emp2+" is "+totalWages);
		
		
		
	}
}
