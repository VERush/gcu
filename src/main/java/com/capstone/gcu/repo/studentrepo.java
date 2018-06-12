package com.capstone.gcu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.gcu.entity.student;

public interface studentrepo extends JpaRepository<student, Integer> {
	Optional<student> findByLastname(String lastname);
	
	Optional<student> findByStudentid(int studentid); 

}
