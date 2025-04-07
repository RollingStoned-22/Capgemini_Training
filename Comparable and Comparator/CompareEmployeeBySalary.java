package comparable_and_comparator;

import java.util.Comparator;

public class CompareEmployeeBySalary implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return (int)(e1.salary - e2.salary);
	}

}
