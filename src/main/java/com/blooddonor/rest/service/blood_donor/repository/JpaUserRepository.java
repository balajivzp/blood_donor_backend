package com.blooddonor.rest.service.blood_donor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blooddonor.rest.service.blood_donor.model.User;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Integer> {
    User findByname(String name);
}
