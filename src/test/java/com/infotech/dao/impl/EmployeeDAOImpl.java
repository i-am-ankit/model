package com.infotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createEmployee(Employee employee) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = dataSource.getConnection();
			String SQL = "INSERT INTO employee_table(employeeName, email, gender, salary) VALUES(?,?,?,?)"; 
			ps = con.prepareStatement(SQL);
			
			ps.setString(1, employee.getEmployeeName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getGender());
			ps.setDouble(4, employee.getSalary());
			
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate > 0)
			{
				System.out.println("Employee details created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Employee getEmployeeById(int employeeId) 
	{
		return null;
	}

	public void deleteEmployeeById(int employeeId) 
	{
		
	}

	public void updateEmployeeEmailById(String newEmail, int employeeId) 
	{
		
	}

	public List<Employee> getAllEmployeesDetails()
	{
		return null;
	}
}