package com.piedpiper.restsample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.piedpiper.restsample.model.Employee;

/**
 * 
 * @author Prasanth Ramachandran
 * 
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}