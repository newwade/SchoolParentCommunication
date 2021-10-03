package com.cg.spc.service;

import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;

public interface IStudentExamAttemptService {

	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt studentExamAttempt);

	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt studentExamAttempt);

	public String deleteStudentExamAttempt(StudentExamAttempt studentExamAttempt);

	public StudentExamAttempt retrieveAllStudentExamAttemptByStudent(int studentId);

	public Optional<StudentExamAttempt> retrieveStudentExamAttemptById(int id);

}
