package com.blooddonor.rest.service.blood_donor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String email;
  private String mobilenumber;
  private String address;
  private String dob;
  private String city;
  private String password;
  
  protected User() {
	  
  }
public User(Integer id, String name, String email, String mobilenumber, String address, String dob, String city,
		String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobilenumber = mobilenumber;
	this.address = address;
	this.dob = dob;
	this.city = city;
	this.password = password;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
