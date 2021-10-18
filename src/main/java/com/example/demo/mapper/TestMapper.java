package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Employee;

@Repository
@Mapper
public interface TestMapper {
	List<Employee> selectAllEmployees();

	List<Employee> selectEmployeeByIdOrName(String employeeInfo);

	void insertEmployee(Employee employee);

	void updateEmployee(Employee employee);
	
	void deleteEmployee(String employeeId);
}
