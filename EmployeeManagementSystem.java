import java.util.ArrayList;

public class EmployeeManagementSystem {
	// define constants for tax and national insurance rates
	private static final double TAX_RATE = 0.2;
	private static final double NATIONAL_INSURANCE_RATE = 0.1;
	
	// define an Employee class to store employee details
	private static class Employee {
		private String name;
		private int id;
		private double salary;
		
		public Employee(String name, int id, double salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
		
		public String getName() {
			return name;
		}
		
		public int getId() {
			return id;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
	}
	
	// define a PaySlip class to store pay slip details
	
	
	public static void main(String args[]) {
		
	}
}
