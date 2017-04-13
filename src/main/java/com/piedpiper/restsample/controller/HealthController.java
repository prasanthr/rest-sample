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
@RequestMapping("/health")
public class HealthController {
	
	@RequestMapping("/")
    String home() {
        return "Status: OK";
    }
	
	
}
