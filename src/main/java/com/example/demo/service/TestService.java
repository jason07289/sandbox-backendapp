package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Employee;

public interface TestService {
	List<Employee> findAllEmployees();
	List<Employee> findEmployeeByIdOrName(String employeeInfo);
}
