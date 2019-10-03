package com.cg.ems.dao;

import java.util.List;

import com.cg.ems.dto.Employee;

public interface EmployeeDao {

	public Employee save(Employee emp);
	public List<Employee> showEmployee();
	public Employee search(int id);
	public void remove(int id);
}
