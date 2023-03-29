package com.pack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.Employee;
import com.pack.repository.EmployeeRepository;
import com.pack.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public void createEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployee(String employeeId) {
		Employee e = new Employee();
		employeeRepo.delete(employeeRepo.findById(employeeId).get());
		return e;
	}
	
}
