package com.cg.spc.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IClassIdRepository;
import com.cg.spc.repository.IDiaryNotesRepository;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.service.IExamService;

@Service
public class IExamServiceImpl implements IExamService {

	@Autowired
	private IExamRepository examRepository;

	@Autowired
	private IClassIdRepository classIdRepository ;

	@Override
	public Exam addExam(Exam exam) {
		// TODO Auto-generated method stub
		return examRepository.save(exam);
	}

	@Override
	public String deleteExam(int id) {
		// TODO Auto-generated method stub
		examRepository.deleteById((long) id);
		return "Exam created with the id " + id + " deleted";

	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		Optional<Exam> optional = examRepository.findById(exam.getExamId());
		if (optional.isPresent()) {
			examRepository.saveAndFlush(exam);
		}
		return exam;	
	}

	@Override
	public Exam listAllExamsByDate(LocalDate localDate) {
		// TODO Auto-generated method stub
		return examRepository.findByDateOfExam(localDate);

	}

	@Override
	public Exam listAllExamsByClass(int classId) {
		// TODO Auto-generated method stub
		Optional<ClassId> class_= classIdRepository.findById((long) classId);
		if (class_.isPresent()) {
			return examRepository.findByClassId(class_.get());
			
		}
		return null;
	}

	@Override
	public List<Exam> listAllExamsByStudent(Student student) {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	@Override
	public Optional<Exam> listExamById(int id) {
		// TODO Auto-generated method stub
		return examRepository.findById((long) id);
	}

}
