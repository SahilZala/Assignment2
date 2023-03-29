package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;
import com.pack.model.Response;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@PostMapping("/create")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee)
	{
		
		employeeDao.createNewEmployee(employee);
		Response r =  new Response("employee created successfuly",null);
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	
	@GetMapping("get")
	public ResponseEntity<Object> getAllEmployee()
	{
		
		Response r =  new Response("",employeeDao.getAllEmployee());
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee)
	{
		Response r =  new Response("updatation done",employeeDao.updateEmployee(employee));
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
//	
//	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable String id)
	{
		
		Response r =  new Response("deleted successfuly",employeeDao.deleteEmployee(id));
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
}
