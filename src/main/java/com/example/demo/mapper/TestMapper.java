package com.example.demo.mapper;

import java.util.List;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Employee;
<<<<<<< HEAD
=======

>>>>>>> upstream/master

@Repository
@Mapper
public interface TestMapper {
<<<<<<< HEAD
	List<Employee> selectAllEmployees();

	List<Employee> selectEmployeeByIdOrName(String employeeInfo);

	void insertEmployee(Employee employee);

	void updateEmployee(Employee employee);
	
	void deleteEmployee(String employeeId);
=======
	List<Employee> selectTest();
	List<Employee> selectAllEmployees();
>>>>>>> upstream/master
}
