package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

@Repository
public interface IFeeInstallmentRepository extends JpaRepository<FeeInstallment, Long> {
	public FeeInstallment findByFee(Fee fee);

}
