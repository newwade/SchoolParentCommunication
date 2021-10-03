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
import com.cg.spc.entities.StudentExamAttempt;
import com.cg.spc.service.IStudentExamAttemptService;

@RestController
@RequestMapping(value = "/attempt")
public class IStudentExamAttemptController {

	@Autowired
	private IStudentExamAttemptService studentExamAttemptService;

	@PostMapping(value = "/add")
	public StudentExamAttempt createExamAttempt(@RequestBody StudentExamAttempt studentExamAttempt) {
		return studentExamAttemptService.addStudentExamAttempt(studentExamAttempt);

	}

	@PutMapping(value = "/update")
	public StudentExamAttempt updateExamAttempt(@RequestBody StudentExamAttempt studentExamAttempt) {
		return studentExamAttemptService.updateStudentExamAttempt(studentExamAttempt);

	}

	@DeleteMapping(value = "/delete")
	public String deleteExamAttempt(@RequestBody StudentExamAttempt studentExamAttempt) {
		return studentExamAttemptService.deleteStudentExamAttempt(studentExamAttempt);

	}

	@GetMapping(value = "/getExamAttempt/student/{id}")
	public StudentExamAttempt getExamAttemptByStudent(@PathVariable int studentId) {
		return studentExamAttemptService.retrieveAllStudentExamAttemptByStudent(studentId);
	}

	@GetMapping(value = "/getExamAttempt/{id}")
	public Optional<StudentExamAttempt> getExamAttempt(@PathVariable("id") int id) {
		return studentExamAttemptService.retrieveStudentExamAttemptById(id);
	}

}
