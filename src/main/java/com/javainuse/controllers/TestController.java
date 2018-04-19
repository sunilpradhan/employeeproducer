package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod="getFallbackdata")
	public Employee firstPage() {
		System.out.println("inside first page..");
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		
/*		if(emp.getName().equalsIgnoreCase("emp1"))
			throw new RuntimeException();
*/

		return emp;
	}
	
	public Employee getFallbackdata(){
		System.out.println("inside fallback..");
		Employee emp = new Employee();
		emp.setName("falback");
		emp.setDesignation("manallbackkk");
		emp.setEmpId("1");
		emp.setSalary(3000);
		
		return emp;

	}

}