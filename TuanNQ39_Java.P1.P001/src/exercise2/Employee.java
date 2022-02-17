package exercise2;

public class Employee {
	private String firstName;
	private String lastName;
	private double mounthlySalary;
	
	public Employee(String firstName, String lastName, double mounthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(mounthlySalary >= 0) {
			this.mounthlySalary = mounthlySalary;
		}
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary >= 0) {
			this.mounthlySalary = monthlySalary;
		}
	}
	
	public double getMonthlySalary() {
		return mounthlySalary;
	}
}
