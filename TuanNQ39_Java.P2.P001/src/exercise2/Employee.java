package exercise2;
import java.util.Date;
public abstract class Employee implements Payable{

    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private String phone;
    private String email;

    public Employee(String first, String last, String ssn, Date birthDate, String phone, String email) {
        this.firstName = first;
        this.lastName = last;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
    }

    public void setFirstName(String first) {
        firstName = first;	
    }	

    //	return first name
    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String last) {
        lastName = last;
    }	


    public String getLastName() {
        return lastName;
    }	
    public void setBirthDate(Date bdate) {
        birthDate = bdate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nBirthdate: %s \nPhone Number: %s \nEmail: %s",
                getFirstName(), getLastName(), getSsn(), getBirthDate(), getPhone(), getEmail());
    }	

    public abstract double earnings();
}

