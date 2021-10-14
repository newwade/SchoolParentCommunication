package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Exam;

@Repository
public interface IExamRepository extends JpaRepository<Exam, Long> {
	public List<Exam> findByDateOfExam(Date localDate);

	public List<Exam> findByClassId(ClassId classId);

}
