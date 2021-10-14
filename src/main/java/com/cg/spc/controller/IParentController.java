package com.cg.spc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IParentService;
import com.cg.spc.service.IStudentService;

@RestController
@RequestMapping(value = "/parent")
public class IParentController {

	@Autowired
	private IParentService parentService;

	@PostMapping(value = "/add")
	public Parent createParent(@RequestBody Parent parent) {
		return parentService.addParent(parent);
		
	}

	@PutMapping(value = "/update")
	public Parent updateParent(@RequestBody Parent parent) {
		return parentService.updateParent(parent);
		
	}

	@GetMapping(value = "/viewParent/{id}")
	public Optional<Parent> getParent(@PathVariable("id") int id) {
		return parentService.retrieveParentById(id);
	}
	

	

	@GetMapping(value = "/viewParent/student/{studentId}")
	public List<Parent>getParentByStudent(@PathVariable("studentId") int studentId) {
		return parentService.retrieveParentByStudent(studentId);
	}

}
