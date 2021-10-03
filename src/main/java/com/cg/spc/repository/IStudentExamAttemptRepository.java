package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;

@Repository
public interface IStudentExamAttemptRepository extends JpaRepository<StudentExamAttempt, Long>{
	
	public StudentExamAttempt findByStudent(Student student);


}
