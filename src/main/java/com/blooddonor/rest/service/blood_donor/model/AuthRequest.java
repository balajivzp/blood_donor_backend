package com.blooddonor.rest.service.blood_donor.model;

import lombok.Data;
@Data
public class AuthRequest {
	 private String name;
	 private String password;
	public AuthRequest(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}
		public String getUserName() {
			return name;
		}
		public void setUserName(String userName) {
			this.name = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
