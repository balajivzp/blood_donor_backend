package com.blooddonor.rest.service.blood_donor.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blooddonor.rest.service.blood_donor.model.User;
import com.blooddonor.rest.service.blood_donor.repository.JpaUserRepository;

@Service
public class UserService implements UserDetailsService {
     @Autowired
	private JpaUserRepository jpaRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = jpaRepo.findByname(username);
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), new ArrayList<>());
	}


}
