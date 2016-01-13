package com.mindtree.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.example.model.Employee;
import com.mindtree.example.svc.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeSvc;
	
	@RequestMapping("/getAllEmpoyees")
	public ModelAndView getAllEmployees() {
		List<Employee> allEmployees = employeeSvc.getAllEmployeeDetails();
		ModelAndView modelAndView = new ModelAndView("/home");
		// now convert into employeeDto
		if (allEmployees == null) {
			modelAndView.addObject("emp.employees.empty",
					"It seems to be no employees in your company please try to add it");
			return modelAndView;
		}
		modelAndView.addObject("employeeList", allEmployees);
		return modelAndView;
	}
	
}
