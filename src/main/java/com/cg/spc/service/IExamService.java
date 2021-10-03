package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;

public interface IExamService {
	public Exam addExam(Exam exam);

	public String deleteExam(int id);

	public Exam updateExam(Exam exam);

	public Exam listAllExamsByDate(LocalDate localDate);

	public Exam listAllExamsByClass(int classId);

	public List<Exam> listAllExamsByStudent(Student student);

	public Optional<Exam> listExamById(int id);

}
