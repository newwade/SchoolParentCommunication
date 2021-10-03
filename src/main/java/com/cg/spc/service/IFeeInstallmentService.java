package com.cg.spc.service;

import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

public interface IFeeInstallmentService {

	public FeeInstallment makePayment(FeeInstallment feeInstallment);

	public List<FeeInstallment> pendingInstallments(Student student);


	public FeeInstallment retrieveAllFeeInstallmentsByFee(int feeId);

	public Optional<FeeInstallment> retrieveFeeInstallmentById(long id);

}
