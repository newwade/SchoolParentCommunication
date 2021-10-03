package com.cg.spc.service;

import java.time.LocalDate;
import java.util.Optional;

import com.cg.spc.entities.ClassDiary;

public interface IClassDiaryService {
	public ClassDiary addClassDiary(ClassDiary classDiary);

//	public ClassDiary retrieveClassDiary(LocalDate localDate);

	public Optional<ClassDiary> retrieveClassDiaryById(Long id);

}
