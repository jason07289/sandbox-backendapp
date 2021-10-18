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
<<<<<<< HEAD
	public void updateEmployee(Employee employee) {// update Service
		testMapper.updateEmployee(employee);		
=======
	public List<Employee> selectTest() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("12302","정재엽"));
		//return "정재엽";
		return testMapper.selectTest();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return testMapper.selectAllEmployees();
>>>>>>> upstream/master
	}
	
	@Override
	public void removeEmployeeById(String employeeId) {
		testMapper.deleteEmployee(employeeId);
	}
	

}
