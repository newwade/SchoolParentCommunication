package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.repository.IStudentExamAttemptRepository;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IStudentExamAttemptService;

@Service
public class IStudentExamAttemptServiceImpl implements IStudentExamAttemptService {
	@Autowired
	private IStudentExamAttemptRepository studentExamRepository;
	@Autowired
	private IStudentRepository studentRepository;
	@Autowired
	private IExamRepository examRepository;

	@Override
	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt studentExamAttempt) {
		// TODO Auto-generated method stub
		Student student = studentExamAttempt.getStudent();
		if(student!=null) {
			long studentId = student.getUserId();
			Optional<Student> res_student=studentRepository.findById(studentId);
			if(res_student.isPresent()) {
				studentExamAttempt.setStudent(res_student.get());
			}
		}
		
		Exam exam= studentExamAttempt.getExam();
		if(exam!=null) {
			long examId = exam.getExamId();
			Optional<Exam> res_exam=examRepository.findById(examId);
			if(res_exam.isPresent()) {
				studentExamAttempt.setExam(res_exam.get());
			}
		}
		return studentExamRepository.save(studentExamAttempt);
	}

	@Override
	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt studentExamAttempt) {
		// TODO Auto-generated method stub
		Optional<StudentExamAttempt> existingAttemptContainer = studentExamRepository
				.findById((long) studentExamAttempt.getStudentExamAttemptId());
		if (existingAttemptContainer.isPresent()) {
			studentExamRepository.saveAndFlush(studentExamAttempt);
		}
		return studentExamAttempt;
	}

	@Override
	public String deleteStudentExamAttempt(StudentExamAttempt studentExamAttempt) {
		// TODO Auto-generated method stub
		long id = studentExamAttempt.getStudentExamAttemptId();
		studentExamRepository.delete(studentExamAttempt);
		return "ExamAttempt with the id " + id + "deleted";
	}

	@Override
	public StudentExamAttempt retrieveAllStudentExamAttemptByStudent(int studentId) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById((long) studentId);
		if (student.isPresent()) {
			return studentExamRepository.findByStudent(student.get());
		}
		return null;
	}

	@Override
	public Optional<StudentExamAttempt> retrieveStudentExamAttemptById(int id) {
		// TODO Auto-generated method stub
		return studentExamRepository.findById((long) id);
	}

}
