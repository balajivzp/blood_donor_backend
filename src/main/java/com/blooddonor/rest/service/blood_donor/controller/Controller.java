package com.blooddonor.rest.service.blood_donor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blooddonor.rest.service.blood_donor.model.AuthRequest;
import com.blooddonor.rest.service.blood_donor.model.BloodDonor;
import com.blooddonor.rest.service.blood_donor.model.User;
import com.blooddonor.rest.service.blood_donor.repository.JpaBloodDonorRepository;
import com.blooddonor.rest.service.blood_donor.repository.JpaUserRepository;
import com.blooddonor.rest.service.blood_donor.utils.JwtUtils;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {
		@Autowired
	    private JpaUserRepository jpaRepo;
		@Autowired
		private JpaBloodDonorRepository jpaBloodRepo;
	    @Autowired
	    private JwtUtils jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Blood donor community !!";
	}

	    @PostMapping("/authenticate")
	    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
	            );
	        } catch (Exception ex) {
	            throw new Exception("Invalid Username/password");
	        }
	        return jwtUtil.generateToken(authRequest.getUserName());
	    }
	    @PostMapping("/register")
	    public String registerUser(@RequestBody User user) {
	    	jpaRepo.save(user);
	    	return "Register Successfull";
	    }
	    @GetMapping("/getProfile/{name}")
	    public User getProfile(@PathVariable String name) {
	    	User user = jpaRepo.findByname(name);
	    	return user;
	    }
	    @PutMapping("/updateProfile/{id}")
	    public String updateProfile(@PathVariable Integer id, @RequestBody User user) {
	    	jpaRepo.save(user);
	    	return "Updated Successfully";
	    }
	    @PostMapping("/saveDonor")
	    public String saveDonor(@RequestBody BloodDonor donor) {
	    	jpaBloodRepo.save(donor);
	    	return "Donor Successfully saved";
	    }
	    
	    @GetMapping("/getDonor/{group}/{city}")
	    public List<BloodDonor> getDonor(@PathVariable String group, @PathVariable String city) { 
	    List<BloodDonor> donors = jpaBloodRepo.findAllByBloodgroupAndCity(group, city);
	    return donors;
	    }

}
