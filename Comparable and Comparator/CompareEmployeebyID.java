package comparable_and_comparator;

import java.util.Comparator;

public class CompareEmployeebyID implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee E1 = (Employee)o1;
		Employee E2 = (Employee)o2;
		return E1.id - E2.id;
	}
	
}
