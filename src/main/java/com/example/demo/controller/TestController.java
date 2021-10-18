package com.example.demo.controller;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
>>>>>>> upstream/master
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.Employee;

import lombok.AllArgsConstructor;

@RestController
<<<<<<< HEAD
@CrossOrigin(origins = "*")
@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
public class TestController {

	@Autowired
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

=======
@AllArgsConstructor
@RequestMapping(value = "/")
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/test")
    List<Employee> testGet(){
		return testService.selectTest();
    }
	
	// 직원 ALL 조회
	@GetMapping("/all")
	List<Employee> findAllEmployees() {
		return testService.findAllEmployees();
	}
	
>>>>>>> upstream/master
	// 직원등록
	@PostMapping("/insertEmployee")
	String insertEmployee(@RequestBody Employee employeeParm) {
		Employee employee = new Employee(employeeParm.getEmployeeId(), employeeParm.getEmployeeName());
		testService.insertEmployee(employee);
		return "insertEmployee OK";
	}

	// 직원이름변경(ID) Controller
	@PutMapping("/updateEmployee/{employeeId}")
	String updateEmployee(@PathVariable String employeeId, @RequestBody Employee employeeParm) {
		Employee employee = new Employee(employeeId, employeeParm.getEmployeeName());
		testService.updateEmployee(employee);
		return "updateEmployee OK";
	}

	// 직원삭제(ID)
	@PostMapping("/remove/{employeeId}")
	boolean removeEmployeeById(@PathVariable int employeeId) {
		String employeeIdString = Integer.toString(employeeId);
		if (testService.findEmployeeByIdOrName(employeeIdString).isEmpty()) {
			return false;
		}
		testService.removeEmployeeById(employeeIdString);
		return true;
	}

	// Exception
	@GetMapping("/exception/{exceptionKind}")
	void executeException(@PathVariable String exceptionKind) {
		if ("numberformat".equals(exceptionKind)) {
			String s = "a";
			System.out.println(Integer.parseInt(s));
		}

		if ("nullpointer".equals(exceptionKind)) {
			String a = null;
			a.equals("abcdefg");
		}
	}
}
