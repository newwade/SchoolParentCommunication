package com.cg.spc.service;

import java.util.List;

import java.util.*;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;

public interface IStudentService {

	public Student addStudent(Student student);

	public Student updateStudent(Student Student);
	
	public String deleteStudent(Student Student);

	public List<Student> retrieveAllStudents();

	public Optional<Student> retrieveStudentById(Long id);

}
