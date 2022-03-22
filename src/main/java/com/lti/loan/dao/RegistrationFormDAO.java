package com.lti.loan.dao;

import java.util.List;

import com.lti.loan.pojo.RegistrationForm;



public interface RegistrationFormDAO {
	
	public boolean addVehicle(RegistrationForm registrationform );
	public List<RegistrationForm> getVehicles();
	
	
		public boolean validateLogin(String email,String password);
		
		public boolean adminvalidateLogin(String email,String password);
		
		
		
		public List<RegistrationForm> searchUser(String email);
		
		
		public List<RegistrationForm> searchAdmin(int userid);



}
