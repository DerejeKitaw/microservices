package com.apisero.controller;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apisero.model.Employee;
import com.apisero.service.IEmployeeService;

@RestController
@RequestMapping("/api/mongo/emp")
public class EmployeeController {
	@Autowired
	IEmployeeService service;
	private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@PostMapping(value = "/create")
	public String create(@RequestBody Employee employee) {
		System.out.println(employee);
		logger.debug("Saving employee record");
		service.createEmployee(employee);
		return "EMployee Record Created";
	}

	@GetMapping("/getAll")
	public Collection<Employee> getAllEmployee() {
		logger.debug("get all employee records");
		return service.getAllEmployee();
	}

	@GetMapping("/getById/{employeeId}")
	public Optional<Employee> getEMployeeById(@PathVariable(value = "employeeId") int employeeId) {
		logger.debug("get employee by id");
		return service.getEmployeeById(employeeId);
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Employee employee) {
		logger.debug("Updating employee with employee-id= {}.", employee.getId());
		service.updateEmployee(employee);
		return "Employee record for employee-id= " + employee.getId() + " updated.";
	}

	@DeleteMapping(value = "/delete/{employeeId}")
	public String delete(@PathVariable(value = "employeeId") int employeeId) {
		logger.debug("Deleting employee with employee-id= {}.", employeeId);
		service.deleteEmployeeById(employeeId);
		return "Employee record for employee-id= " + employeeId + " deleted.";
	}

	@DeleteMapping(value = "/deleteall")
	public String deleteAll() {
		logger.debug("Deleting all employees.");
		service.deleteAllEmployee();
		return "All employee records deleted.";
	}
}
