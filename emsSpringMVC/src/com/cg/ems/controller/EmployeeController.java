package com.cg.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addEmployee(@ModelAttribute("emp") Employee employee) {
		return "AddEmployee";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String addData(@ModelAttribute("emp") Employee emp) {
		service.addEmployee(emp);
		return "index";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public ModelAndView showEmployee() {
		List<Employee> list = service.showEmployee();
		return new ModelAndView("ShowEmployee", "empData", list);
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteEmployee() {
		return "DeleteEmployee";
	}
	@RequestMapping(value="deletedata", method=RequestMethod.POST)
	public String deleteData(@RequestParam("id") int id) {
		service.deleteEmployee(id);
		return "redirect:/show";
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchEmployee() {
		return "SearchEmployee";
	}
	@RequestMapping(value="/searchData", method=RequestMethod.POST)
	public ModelAndView searchData(@RequestParam("sid") int id) {
		Employee emp = service.searchEmployee(id);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		return new ModelAndView("SearchEmployee", "empData", empList);		
	}
}
