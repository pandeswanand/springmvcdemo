package com.cg.ems.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.ems.dto.Employee;
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao{

	@PersistenceContext
	EntityManager manager;
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		manager.persist(emp);
		return emp;
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("From Employee");
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee search(int id) {
		// TODO Auto-generated method stub
		Employee emp = manager.find(Employee.class, id);
		return emp;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		Employee emp = manager.find(Employee.class, id);
		manager.remove(emp);
	}


}
