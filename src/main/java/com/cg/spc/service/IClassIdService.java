package com.cg.spc.service;

import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.ClassId;

public interface IClassIdService {
	
	public ClassId addClass(ClassId classId);

	public ClassId updateClass(ClassId classId);
	
	public Optional<ClassId> deleteClass(Long id);
	
	public List<ClassId> retrieveAllClass();
	
	public Optional<ClassId> retrieveClassById(Long id);

}
