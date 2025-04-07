package comparable_and_comparator;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shuvam Majumder", 60080);
		Employee e2 = new Employee(2, "Soumyodip Sutradhar", 60000);

		compareBasedOnName(e1, e2);
		CompareEmployeebyID CID = new CompareEmployeebyID();
		System.out.println(CID.compare(e1, e2));
	}

	public static void compareBasedOnName(Employee e1, Employee e2) {
		if (e1.compareTo(e2) > 0)
			System.out.println("E1 salary is greater");
		else if (e1.compareTo(e2) < 0)
			System.out.println("E2 salary is greater");
		else
			System.out.println("Both E1 and E2 and same salary");
	}
}
