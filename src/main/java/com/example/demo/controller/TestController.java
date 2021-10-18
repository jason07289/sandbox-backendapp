package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.Employee;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/")
@CrossOrigin(origins = "*")
public class TestController {
	
	private TestService testService;
	
	// 직원 ALL 조회
	@GetMapping("/search")
	List<Employee> findAllEmployees() {
		return testService.findAllEmployees();
	}
	
	// 직원 조회 - EmployeeId Or EmployeeName
	@GetMapping("/search/{employeeInfo}")
	List<Employee> findEmployeeByIdOrName(@PathVariable String employeeInfo) {
		return testService.findEmployeeByIdOrName(employeeInfo);
	}
	
	// Exception
	@GetMapping("/exception/{exceptionKind}")
	void executeException(@PathVariable String exceptionKind) {
		if("numberformat".equals(exceptionKind)) {
			String s = "a";
			System.out.println(Integer.parseInt(s));
		}
		
		if("nullpointer".equals(exceptionKind)) {
			String a = null;
			a.equals("abcdefg");
		}
	}
	
}
