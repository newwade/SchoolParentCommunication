package com.cg.spc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.service.IClassDiaryService;
import com.cg.spc.service.IFeeInstallmentService;
import com.cg.spc.service.impl.IClassDiaryServiceImpl;

@RestController
@RequestMapping(value = "/classDiary")
public class IClassDiaryController {

	@Autowired
	private IClassDiaryService classDiaryService;

	@PostMapping(value = "/add")
	public ClassDiary addClassDiary(@RequestBody ClassDiary classDiary) {
		return classDiaryService.addClassDiary(classDiary);

	}
	

	@GetMapping(value = "/getDiary/{id}")
	public Optional<ClassDiary> getClassDiary(@PathVariable ("id") long id) {
		return classDiaryService.retrieveClassDiaryById(id);

	}

}
