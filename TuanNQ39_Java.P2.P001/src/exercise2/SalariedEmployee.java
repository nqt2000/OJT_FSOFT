package exercise2;

import java.util.Date;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String ssn, Date birthDate, String phone, String email, double salary)
	{
		super(first, last, ssn, birthDate, phone, email);	
		setWeeklySalary(salary);	
	}	
	
	public void setWeeklySalary(double salary)
	{
		if (salary >= 0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
	}	
	

	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	

	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}
	

	@Override
	public String toString()
	{
		return String.format("salaried employee: %s\n%s: $%, .2f",
				super.toString(), "weekly salary", getWeeklySalary());
	}	

    @Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
