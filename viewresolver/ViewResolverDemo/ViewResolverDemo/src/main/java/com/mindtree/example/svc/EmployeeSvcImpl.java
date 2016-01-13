package com.mindtree.example.svc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mindtree.example.model.Employee;

@Component("employeeSvc")
public class EmployeeSvcImpl implements EmployeeService {

	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> employeeList = getAllEmployees();

		return employeeList;
	}

	private List<Employee> getAllEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee("1111", "Santosh", "Sanik"));

		employeeList.add(new Employee("2222", "Nitish", "Galal"));

		return employeeList;
	}

}
