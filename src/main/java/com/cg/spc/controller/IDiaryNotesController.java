package com.cg.spc.controller;

import java.time.LocalDate;
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

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;
import com.cg.spc.service.IDiaryNotesService;

@RestController
@RequestMapping(value = "/notes")
public class IDiaryNotesController {

	@Autowired
	private IDiaryNotesService diaryNotesService;

	@PostMapping(value = "/add")
	public DiaryNotes createNotes(@RequestBody DiaryNotes diaryNotes) {
		return diaryNotesService.addDiaryNotes(diaryNotes);

	}

	@PutMapping(value = "/update")
	public DiaryNotes updateNotes(@RequestBody DiaryNotes diaryNotes) {
		return diaryNotesService.updateDiaryNotes(diaryNotes);

	}

	@DeleteMapping(value = "/delete/{id}")
	public Optional<DiaryNotes> deleteNotes(@PathVariable("id") int id) {
		return diaryNotesService.deleteDiaryNotes(id);

	}


	@GetMapping(value = "/getNotes/{id}")
	public Optional<DiaryNotes> getStudent(@PathVariable("id") Long id ) {
		return diaryNotesService.retrieveDiaryNotesById(id);
	}
	
	@GetMapping(value = "/getAllNotes")
	public List<DiaryNotes> getStudent() {
		return diaryNotesService.retrieveAllDiaryNotes();
	}
	
//	@PostMapping(value = "/getAllNotes")
//	public List<DiaryNotes> getAllNotes(@RequestBody LocalDate date) {
//		return diaryNotesService.retrieveAllDiaryNotes(date);
//
//	}
//
//	@PostMapping(value = "/getAllNotes/subject")
//	public List<DiaryNotes> getAllNotesBySubject(@RequestBody Subject subject) {
//		return diaryNotesService.retrieveAllDiaryNotes(subject);
//
//	}
}
