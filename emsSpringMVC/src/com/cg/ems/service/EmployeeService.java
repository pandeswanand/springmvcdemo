package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	public List<Employee> showEmployee();
	public Employee searchEmployee(int id);
	public void deleteEmployee(int id);
}
