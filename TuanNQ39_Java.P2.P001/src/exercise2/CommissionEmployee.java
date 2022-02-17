package exercise2;

import java.util.Date;

public class CommissionEmployee extends Employee {
	private double grossSales;
    private double commissionRate;
    private double basicSalary;

    public CommissionEmployee(String first, String last, String ssn, Date birthDate, String phone, String email, double sales, double rate, double salary) {
        super(first, last, ssn, birthDate, phone, email);
        setGrossSales(sales);
        setCommissionRate(rate);
        setBasicSalary(salary);
    }

    public void setBasicSalary(double salary) {
        if (salary >= 0.0) {
            basicSalary = salary;
        } else {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }
    }	
    
    public double getBasicSalary() {
        return basicSalary;
    }	
    

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            commissionRate = rate;
        } else {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0) {
            grossSales = sales;
        } else {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s: %s\n%s: $%,.2f; %s: %.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate(),
                "basic salary", getBasicSalary());
    }

    @Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
