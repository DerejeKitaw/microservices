package com.apisero.service;

import java.util.Collection;
import java.util.Optional;

import com.apisero.model.Employee;

public interface IEmployeeService {
	public void createEmployee(Employee employee);
	
	public Collection<Employee> getAllEmployee();
	
	public Optional<Employee> getEmployeeById(int id);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployeeById(int id);
	
	public void deleteAllEmployee();

}
