package com.cibertec.edu.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.models.Student;

@Repository
public interface StudentDao extends CrudRepository<Student,Long> {
	public List<Student> findAll();
}