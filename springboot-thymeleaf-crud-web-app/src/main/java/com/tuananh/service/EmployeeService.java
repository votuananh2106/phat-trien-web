package com.tuananh.service;

import java.util.List;

import com.tuananh.model.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployees();
	 void saveEmployee(Employee employee);
	 Employee getEmployeeById(long id);
	}
