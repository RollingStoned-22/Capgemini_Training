package polymorphism;

public class Driver {
	public static void main(String[] args) {
		Employee ft_emp = new FullTimeEmployee("Shuvam", 60000.20, 10000);
		Employee pt_emp = new PartTimeEmployee("Mavuhs", 12000, 2000);
		ft_emp.employeeInfo();
		((FullTimeEmployee)ft_emp).jobRole();
		pt_emp.employeeInfo();
		((PartTimeEmployee)pt_emp).designation();
		details(pt_emp);
	}
	static void details(Employee emp) {
		if(emp instanceof FullTimeEmployee) {
			emp.jobRole();
		}
		else {
			emp.jobRole();
			((PartTimeEmployee)emp).designation();
		}
	}
}
