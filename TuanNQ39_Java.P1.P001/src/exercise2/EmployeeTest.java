package exercise2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee tuan = new Employee("Quang Tuan", "Nguyen", 100);
		Employee minh = new Employee("Nhat Minh", "Tran", 200);
		System.out.println(tuan.getFirstName() + "'s monthly salary is " + tuan.getMonthlySalary());
		System.out.println(minh.getFirstName() + "'s monthly salary is " + minh.getMonthlySalary());
		tuan.setMonthlySalary(tuan.getMonthlySalary()*110/100);
		minh.setMonthlySalary(minh.getMonthlySalary()*110/100);
		System.out.println("--------- After 10% boost");
		System.out.println(tuan.getFirstName() + "'s monthly salary is " + tuan.getMonthlySalary());
		System.out.println(minh.getFirstName() + "'s monthly salary is " + minh.getMonthlySalary());

	}

}
