package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Employee;

public interface TestService {
<<<<<<< HEAD
	
	List<Employee> findAllEmployees();

	List<Employee> findEmployeeByIdOrName(String employeeInfo);

	void insertEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void removeEmployeeById(String employeeId);

=======
	List<Employee> selectTest();
	List<Employee> findAllEmployees();
>>>>>>> upstream/master
}
