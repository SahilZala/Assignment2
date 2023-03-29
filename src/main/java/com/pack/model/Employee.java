package com.pack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	@Id
	private String employeeId;
	private String employeeName;
	private String employeeMobileNumber;
	private String employeeEmailId;
	private String designation;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String employeeId, String employeeName, String employeeMobileNumber, String employeeEmailId,
			String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeEmailId = employeeEmailId;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
