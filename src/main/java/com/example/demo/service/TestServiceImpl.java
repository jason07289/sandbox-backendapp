package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.vo.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

	TestMapper testMapper;

	@Override
	public List<Employee> findAllEmployees() {
		return testMapper.selectAllEmployees();
	}

	@Override
	public List<Employee> findEmployeeByIdOrName(String employeeInfo) {
		return testMapper.selectEmployeeByIdOrName(employeeInfo);
	}
	
}
