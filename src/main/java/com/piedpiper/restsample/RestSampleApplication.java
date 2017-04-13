package com.piedpiper.restsample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.piedpiper.restsample.model.Employee;
import com.piedpiper.restsample.repo.EmployeeRepository;

@SpringBootApplication
public class RestSampleApplication {
	
	@Bean
	CommandLineRunner init(EmployeeRepository empRepo) {
		return (evt) -> {
			empRepo.deleteAll();
			Employee emp1 = new Employee("Richard Hendricks");
			empRepo.save(emp1);
			Employee emp2 = new Employee("Erlich Bachman");
			empRepo.save(emp2);
			Employee emp3 = new Employee("Nelson Bighetti");
			empRepo.save(emp3);
		};
	}
	
	public static void main(String[] args) {		
		SpringApplication.run(RestSampleApplication.class, args);
	}

}
