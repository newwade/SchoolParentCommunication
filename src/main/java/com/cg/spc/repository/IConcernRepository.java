package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;
@Repository
public interface IConcernRepository extends JpaRepository<Concern, Long> {
	
	public Concern findByParent(Parent parent);


}
