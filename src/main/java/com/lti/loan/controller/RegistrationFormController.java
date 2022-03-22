package com.lti.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.loan.pojo.RegistrationForm;
import com.lti.loan.service.RegistrationFormService;



@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class RegistrationFormController {
	

	@Autowired
	RegistrationFormService rService;
	
	
	@GetMapping("/registrationform")
	public List<RegistrationForm> getVehicles()
	{
		return rService.getVehicles();
	}
	
	@PostMapping("/registrationform")
	public boolean addVehicle(@RequestBody RegistrationForm registrationform)
	{
		return rService.addVehicle(registrationform);
	
	

}
	@GetMapping("/validatelogin/{email}/{password}") // Passing multiple arguments with url
	public boolean validateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.validateLogin(email, password);
	}
	
	
	@GetMapping("/loan/{email}/{password}") // Passing multiple arguments with url
	public boolean adminvalidateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.adminvalidateLogin(email, password);
	}
	
	@GetMapping("/searchuser/{email}") 
	public List<RegistrationForm> searchUser(@PathVariable("email")  String email)
	{
		return rService.searchUser(email);
	}
	
	@GetMapping("/searchadmin/{userid}") 
	public List<RegistrationForm> searchAdmin(@PathVariable("userId")  int userid)
	{
		return rService.searchAdmin(userid);
	}
	
	
	

}
