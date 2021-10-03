package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
@Repository
public interface IParentRepository extends JpaRepository<Parent, Long> {
	public Parent findByStudent(Student student);

}
