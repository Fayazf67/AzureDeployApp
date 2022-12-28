package com.fayaz.springbootAzureSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootAzureSqlApplication {

	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/product")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return employeeRepo.save(emp);
	}

	@GetMapping("/products")
	public List<Employee> getEmployees()
	{
		return employeeRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureSqlApplication.class, args);
	}

}
