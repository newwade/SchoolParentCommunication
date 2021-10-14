package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IExamService;
import com.cg.spc.service.impl.IExamServiceImpl;

@RestController
@RequestMapping(value = "/exam")
public class IExamController {

	@Autowired
	private IExamService examService;

	@PostMapping(value = "/create")
	public Exam createExam(@RequestBody Exam exam) {
		return examService.addExam(exam);

	}

	@PutMapping(value = "/update")
	public Exam updateExam(@RequestBody Exam exam) {
		return examService.updateExam(exam);

	}

	@DeleteMapping(value = "/exam/{id}")
	public String deleteExam(@PathVariable("id") int id) {
		return examService.deleteExam(id);
	}

	@GetMapping(value = "/viewExam/{id}")
	public Optional<Exam> getExam(@PathVariable("id") int id) {
		return examService.listExamById(id);
	}

	@GetMapping(value = "/getExam/class/{classId}")
	public List<Exam> getExamByClass(@PathVariable("classId") int classId) {
		return examService.listAllExamsByClass(classId);
	}

	
	//need to convert type
	@GetMapping(value = "/getExam/{date}")
	public List<Exam> getExamByClass(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("date") Date date) {
		return examService.listAllExamsByDate(date);

	}

}
