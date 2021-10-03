package com.cg.spc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Student;
import com.cg.spc.service.IStudentService;

@RestController
@RequestMapping(value = "/student")
public class IStudentController {

	@Autowired
	private IStudentService studentService;

	
	@PostMapping(value = "/add")
	public Student createStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return student;
	}

	@PutMapping(value = "/update")
	public Student updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
		return student;
	}

	@DeleteMapping(value = "/delete")
	public Student deleteStudent(@RequestBody Student student) {
		studentService.deleteStudent(student);
		return student;
	}

	@GetMapping(value = "/viewStudents")
	public List<Student> getAllStudent() {
		return studentService.retrieveAllStudents();
	}
	
	@GetMapping(value = "/viewStudent/{id}")
	public Optional<Student> getStudent(@PathVariable("id") Long id ) {
		return studentService.retrieveStudentById(id);
	}

}
