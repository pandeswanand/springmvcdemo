package com.cg.ems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dto.Employee;
@Service("service")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.search(id);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		dao.remove(id);
	}

}
