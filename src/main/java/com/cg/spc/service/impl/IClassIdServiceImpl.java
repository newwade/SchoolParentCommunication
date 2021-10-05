package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.repository.IClassDiaryRepository;
import com.cg.spc.repository.IClassIdRepository;
import com.cg.spc.service.IClassIdService;

@Service
public class IClassIdServiceImpl implements IClassIdService {

	@Autowired
	private IClassIdRepository classIdRepository;

	@Override
	public ClassId addClass(ClassId classId) {
		return classIdRepository.save(classId);
	}

	@Override
	public ClassId updateClass(ClassId classId) {
		// TODO Auto-generated method stub
		Optional<ClassId> optional = classIdRepository.findById(classId.getClassId());
		if (optional.isPresent()) {
			classIdRepository.saveAndFlush(classId);
		}
		return classId;
	}

	@Override
	public Optional<ClassId> deleteClass(Long id) {
		// TODO Auto-generated method stub
		Optional<ClassId> classId = classIdRepository.findById((long) id);
		if (classId.isPresent()) {
			classIdRepository.deleteById((long) id);
		}

		return classId;
	}

	@Override
	public List<ClassId> retrieveAllClass() {
		// TODO Auto-generated method stub
		return classIdRepository.findAll();
	}

	@Override
	public Optional<ClassId> retrieveClassById(Long id) {
		// TODO Auto-generated method stub
		return classIdRepository.findById(id);
	}

}
