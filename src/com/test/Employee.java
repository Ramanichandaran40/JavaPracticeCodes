package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Employee extends POJO{
	public static void main(String[]args) {
		Employee e1 = new Employee();
		e1.setEmpName("Ramanichandaran");
		e1.setEmpID(1023496);
		e1.setSal(35000.64f);
		Employee e2 = new Employee();
		e2.setEmpName("Manibharathi");
		e2.setEmpID(1112020);
		e2.setSal(33000.64f);
		Map emp = new HashMap();
		emp.put(1, e1);
		emp.put(2, e2);
Collection<Employee> o =	emp.values();
for(Employee x:o) {
	System.out.println(x.getEmpName());
	System.out.println(x.getEmpID());
	System.out.println(x.getSal());
}
		
	}

}
