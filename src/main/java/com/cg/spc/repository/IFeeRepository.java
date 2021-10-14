package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;
@Repository
public interface IFeeRepository extends JpaRepository<Fee, Long>{
	public List<Fee> findByStudent(Student student);
	public List<Fee> findByStartMonthYear(Date date);
	

}
