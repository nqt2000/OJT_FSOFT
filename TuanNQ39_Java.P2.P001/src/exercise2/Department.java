package exercise2;
import java.util.ArrayList;
public class Department {
	private String departmentName;
    private ArrayList<Employee> listOfEmployees;

    public Department(String departmentName, ArrayList<Employee> listOfEmployees) {
        this.departmentName = departmentName;
        this.listOfEmployees = listOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public String display() {
        return "Department{" + "departmentName=" + departmentName + ", listOfEmployees=" + listOfEmployees + '}';
    }
}
