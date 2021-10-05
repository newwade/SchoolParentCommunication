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

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.service.IClassIdService;
import com.cg.spc.service.IDiaryNotesService;

@RestController
@RequestMapping(value = "/class")
public class IClassIdController {
	@Autowired
	private IClassIdService classIdService;

	@PostMapping(value = "/add")
	public ClassId createNotes(@RequestBody ClassId classId) {
		return classIdService.addClass(classId);

	}

	@PutMapping(value = "/update")
	public ClassId updateNotes(@RequestBody ClassId classId) {
		return classIdService.updateClass(classId);

	}

	@DeleteMapping(value = "/delete/{id}")
	public Optional<ClassId> deleteNotes(@PathVariable("id") int id) {
		return classIdService.deleteClass((long) id);

	}

	@GetMapping(value = "/getNotes/{id}")
	public Optional<ClassId> getStudent(@PathVariable("id") long id) {
		return classIdService.retrieveClassById(id);
	}

	@GetMapping(value = "/getAllNotes")
	public List<ClassId> getStudent() {
		return classIdService.retrieveAllClass();
	}
}
