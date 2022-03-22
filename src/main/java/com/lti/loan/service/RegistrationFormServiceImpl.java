package com.lti.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.loan.dao.RegistrationFormDAO;
import com.lti.loan.pojo.RegistrationForm;
@Service
@Transactional
public class RegistrationFormServiceImpl implements RegistrationFormService{

	
	@Autowired
	RegistrationFormDAO rdao;
	@Override
	public boolean addVehicle(RegistrationForm veh) {
		
		return rdao.addVehicle(veh);
	}

	@Override
	public List<RegistrationForm> getVehicles() {
		
		return rdao.getVehicles();
	}

	@Override
	public boolean validateLogin(String email, String password) {
		
		return rdao.validateLogin(email,password);
	}

	@Override
	public boolean adminvalidateLogin(String email, String password) {
		
		return rdao.adminvalidateLogin(email, password);
	}

	@Override
	public List<RegistrationForm> searchUser(String email) {
		
		return rdao.searchUser(email);
	}

	@Override
	public List<RegistrationForm> searchAdmin(int userid) {
		;
		return rdao.searchAdmin(userid);
	}

	

	

}
