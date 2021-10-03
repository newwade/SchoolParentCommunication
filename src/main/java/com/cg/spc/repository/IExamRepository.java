package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Exam;

@Repository
public interface IExamRepository extends JpaRepository<Exam, Long> {
	public Exam findByDateOfExam(LocalDate date);

	public Exam findByClassId(ClassId classId);

}
