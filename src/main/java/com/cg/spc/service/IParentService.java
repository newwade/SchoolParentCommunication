package com.cg.spc.service;

import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;

public interface IParentService {

	public Parent addParent(Parent parent);

	public Parent updateParent(Parent parent);

	public List<Parent> retrieveParentListByClass(ClassId classId);

	public Parent retrieveParentByStudent(int studentId);

	public Optional<Parent> retrieveParentById(int id);
}
