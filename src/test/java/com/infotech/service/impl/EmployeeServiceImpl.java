package com.infotech.service.impl;

import java.util.List;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	public Employee fetchEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	public void deleteEmployeeById(int employeeId) {
		employeeDAO.deleteEmployeeById(employeeId);
	}

	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
	}

	public List<Employee> getAllEmployeesInfo() {
		return employeeDAO.getAllEmployeesDetails();
	}
}