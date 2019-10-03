package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("ABC")
	private String empName;
	@Autowired
	private Project projectOne;
	
	public Project getProject() {
		return projectOne;
	}

	public void setProject(Project project) {
		this.projectOne = project;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void getData() { 
		System.out.println("Welcome to the world of spring!!"+this.empName);
		System.out.println(projectOne.getProjId());
	}
	
}
