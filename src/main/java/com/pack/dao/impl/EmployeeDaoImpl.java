package com.pack.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;
import com.pack.service.EmployeeService;

@Service 
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeService employeeService;
	
	@Override
	public void createNewEmployee(Employee employee) {
		employeeService.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(String id) {
		return employeeService.deleteEmployee(id);
	}	
}
