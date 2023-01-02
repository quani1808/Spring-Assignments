package com.in28minutes.rest.webservices.restfulwebservices.Assignments5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
    private static int empCount = 0;
    private static List<EmployeeDetails> emp = new ArrayList<>();
	
	static {
		emp.add(new EmployeeDetails(++empCount,"Rani","software","D",16000));
		emp.add(new EmployeeDetails(++empCount,"Gani","Tester","A",200000));
		emp.add(new EmployeeDetails(++empCount,"Anu","Developer","C",566000));
	}
	public EmployeeDetails saves (EmployeeDetails employee)
	{
		employee.setEmpId(++empCount);
		emp.add(employee);
		return employee;
	}
	public List<EmployeeDetails> findAll()
	{
		return emp;
	}
	public void deleteByempId(int id)
	{
		Predicate<? super EmployeeDetails> predicate = employee -> employee.getEmpId().equals(id);
		emp.removeIf(predicate);
	}
	
	public EmployeeDetails findOne(int id)
	{
		Predicate<? super EmployeeDetails> predicate = u -> u.getEmpId().equals(id);
		return emp.stream().filter(predicate).findFirst().orElse(null);
	}

}
