package com.blooddonor.rest.service.blood_donor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BloodDonor {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String bloodgroup;
	private String mobilenumber;
	private String age;
	private String city;
	private String sex;
	
	protected BloodDonor() {
		
	}

	

	public BloodDonor(Integer id, String name, String blood_group, String mobile_number, String age, String city,
			String sex) {
		super();
		this.id = id;
		this.name = name;
		this.bloodgroup = blood_group;
		this.mobilenumber = mobile_number;
		this.age = age;
		this.city = city;
		this.sex = sex;
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
	


	public String getBloodgroup() {
		return bloodgroup;
	}



	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
