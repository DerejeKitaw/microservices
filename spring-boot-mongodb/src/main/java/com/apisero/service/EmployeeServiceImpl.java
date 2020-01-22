package com.apisero.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisero.dao.EmployeeDAO;
import com.apisero.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	EmployeeDAO dao;
	
	@Override
	public void createEmployee(Employee employee) {
		dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee(){
		return dao.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployeeById(int id){
		return dao.findById(id);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		dao.save(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void deleteAllEmployee() {
		dao.deleteAll();
	}
}
