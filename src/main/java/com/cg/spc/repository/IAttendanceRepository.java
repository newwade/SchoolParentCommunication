package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;

@Component
public interface IAttendanceRepository extends JpaRepository<Attendance, Long>{
	
	public Attendance findByDateOfClass(LocalDate date);
	
	public Attendance findByStudent(Student student);


}
