package com.pack.dao;

import java.util.List;

import com.pack.model.Employee;

public interface EmployeeDao {
	public void createNewEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(String id);
}
