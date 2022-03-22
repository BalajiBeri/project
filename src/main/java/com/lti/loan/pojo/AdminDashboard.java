package com.lti.loan.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="admindashboard")
public class AdminDashboard {
	@Id
	@Column(name="userId")
	private String userId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="phomeno")
	private long phoneNo;
	@Column(name="age")
	private int age;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String State;
	@Column(name="pincode")
	private long pinCode;
	
	
	
	public AdminDashboard() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AdminDashboard(String userId, String firstName, String lastName, String password, String email,
			String gender, long phoneNo, int age, String address, String city, String state, long pinCode) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.age = age;
		this.address = address;
		this.city = city;
		State = state;
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		return "AdminDashboard [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", email=" + email + ", gender=" + gender + ", phoneNo=" + phoneNo
				+ ", age=" + age + ", address=" + address + ", city=" + city + ", State=" + State + ", pinCode="
				+ pinCode + "]";
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public long getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public long getPinCode() {
		return pinCode;
	}



	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	
	

}
