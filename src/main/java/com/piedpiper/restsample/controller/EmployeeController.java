package com.piedpiper.restsample.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.piedpiper.restsample.model.Employee;
import com.piedpiper.restsample.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;

	/*@RequestMapping("/")
    String home() {
        return "Hello World!";
    }*/
	
	@RequestMapping(method = RequestMethod.GET)
	Collection<Employee> getAll() {
		return empRepo.findAll();
	}
	
	@RequestMapping( method = RequestMethod.POST)
	Employee add(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@RequestMapping( method = RequestMethod.PUT)
	Employee edit(@RequestBody Employee emp) {
		Employee emp1 = empRepo.findOne(emp.getId());
		if (emp1==null) {
			throw new UserNotFoundException(emp.getId());
		}
		emp1.setName(emp.getName());
		return empRepo.save(emp1);
	}
	
	
	
}


@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long userId) {
		super("could not find user '" + userId + "'.");
	}
}