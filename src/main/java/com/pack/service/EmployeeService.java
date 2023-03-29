package com.pack.service;

import java.util.List;

import com.pack.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(String employeeId);

}
