package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.repository.IFeeInstallmentRepository;
import com.cg.spc.repository.IFeeRepository;
import com.cg.spc.service.IFeeInstallmentService;

@Service
public class IFeeInstallmentServiceImpl implements IFeeInstallmentService {

	@Autowired
	private IFeeInstallmentRepository feeInstallmentRepository ;
	@Autowired
	private IFeeRepository feeRepository ;
	
	@Override
	public FeeInstallment makePayment(FeeInstallment feeInstallment) {
		// TODO Auto-generated method stub
		return feeInstallmentRepository.save(feeInstallment);
	}

	@Override
	public List<FeeInstallment> pendingInstallments(Student student) {
		// TODO Auto-generated method stub
		return feeInstallmentRepository.findAll();
	}

	@Override
	public Optional<FeeInstallment> retrieveFeeInstallmentById(long id) {
		// TODO Auto-generated method stub
		return feeInstallmentRepository.findById(id);
	}

	@Override
	public FeeInstallment retrieveAllFeeInstallmentsByFee(int feeId) {
		// TODO Auto-generated method stub
		Optional<Fee> fee= feeRepository.findById((long) feeId);
		if(fee.isPresent()) {			
			return feeInstallmentRepository.findByFee(fee.get());
		}
		return null;
	}

}
