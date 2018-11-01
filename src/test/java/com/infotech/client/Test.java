package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		
		Employee employee = new Employee();
		employee.setEmployeeName("ANKIT");
		employee.setEmail("ankit.ai@gmail.com");
		employee.setGender("MALE");
		employee.setSalary(90000.00);
		employeeService.addEmployee(employee);
//		context.close();
	}

}
