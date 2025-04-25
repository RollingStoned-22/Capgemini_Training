package reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Driver {
	public static void main(String[] args) throws Exception {
		Class<Employee> emp = Employee.class;
		Field[] fields = emp.getDeclaredFields();
		
		for(Field field: fields)
			System.out.println(field.getName());
		
		System.out.println("...............................");
		
		Employee e = new Employee("Shuvam", 50000, 63, 22);
		Field f = emp.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e, "Ram");
		System.out.println(f.get(e));
		
		System.out.println("...............................");
		
		Method[] methods = emp.getDeclaredMethods();
		for(Method method : methods)
			System.out.println(method.getName());
	}
}
