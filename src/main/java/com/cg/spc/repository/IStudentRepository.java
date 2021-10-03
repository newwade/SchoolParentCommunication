package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Student;

@Component
public interface IStudentRepository extends JpaRepository<Student, Long>{

}
