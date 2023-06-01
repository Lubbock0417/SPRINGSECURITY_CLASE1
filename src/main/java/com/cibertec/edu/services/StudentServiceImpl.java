package com.cibertec.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.models.Student;
import com.cibertec.edu.repositories.StudentDao;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentRepository;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return this.studentRepository.findAll();
	}
	
}