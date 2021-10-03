package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IFeeRepository;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IParentService;


@Service
public class IParentServiceImpl implements IParentService {
	@Autowired
	private IParentRepository parentRepository;
	@Autowired
	private IStudentRepository studentRepository;



	@Override
	public Parent addParent(Parent parent) {
		// TODO Auto-generated method stub
		return parentRepository.save(parent);
	}

	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		return parentRepository.save(parent);
	}

	@Override
	public List<Parent> retrieveParentListByClass(ClassId classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent retrieveParentByStudent(int studentId) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById((long) studentId);
		if(student.isPresent()) {
			return parentRepository.findByStudent(student.get());	
		}
		return null;

	}

	@Override
	public Optional<Parent> retrieveParentById(int id) {
		// TODO Auto-generated method stub
		return parentRepository.findById((long) id);
	}

}
