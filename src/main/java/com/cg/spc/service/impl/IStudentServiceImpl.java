package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Student;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IStudentService;

@Service
public class IStudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		// TODO Auto-generated method stub
		int id = (int) student.getUserId();
		studentRepo.delete(student);
		return "Deleted Student with the id : " + id;
	}

	@Override
	public List<Student> retrieveAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> retrieveStudentById(Long id) {
		return studentRepo.findById(id);
	}

}
