package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.vo.Employee;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<Employee> findAllEmployees() {
		return testMapper.selectAllEmployees();
	}

	@Override
	public List<Employee> findEmployeeByIdOrName(String employeeInfo) {
		return testMapper.selectEmployeeByIdOrName(employeeInfo);
	}
	
	
	@Override
	public void insertEmployee(Employee employee) {// insert Service
		testMapper.insertEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {// update Service
		testMapper.updateEmployee(employee);		
	}
	
	@Override
	public void removeEmployeeById(String employeeId) {
		testMapper.deleteEmployee(employeeId);
	}
	

}
