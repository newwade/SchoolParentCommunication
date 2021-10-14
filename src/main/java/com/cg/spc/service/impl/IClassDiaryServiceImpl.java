package com.cg.spc.service.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassDiary;
import com.cg.spc.repository.IClassDiaryRepository;
import com.cg.spc.service.IClassDiaryService;

@Service
public class IClassDiaryServiceImpl implements IClassDiaryService {
	@Autowired
	private IClassDiaryRepository classDiaryRepository;

	@Override
	public ClassDiary addClassDiary(ClassDiary classDiary) {
		// TODO Auto-generated method stub
		return classDiaryRepository.save(classDiary);
	}

	@Override
	public Optional<ClassDiary> retrieveClassDiaryById(Long id) {
		// TODO Auto-generated method stub
		return classDiaryRepository.findById(id);
	}

//	@Override
//	public ClassDiary retrieveClassDiary(LocalDate localDate) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
