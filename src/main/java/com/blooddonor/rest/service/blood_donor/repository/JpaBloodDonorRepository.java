package com.blooddonor.rest.service.blood_donor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blooddonor.rest.service.blood_donor.model.BloodDonor;

@Repository
public interface JpaBloodDonorRepository extends JpaRepository<BloodDonor, Integer> {
	 List<BloodDonor> findAllByBloodgroupAndCity(String group, String city);
}
