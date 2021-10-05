package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.repository.IFeeInstallmentRepository;
import com.cg.spc.repository.IFeeRepository;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IFeeInstallmentService;

@Service
public class IFeeInstallmentServiceImpl implements IFeeInstallmentService {

	@Autowired
	private IFeeInstallmentRepository feeInstallmentRepository ;
	@Autowired
	private IFeeRepository feeRepository ;
	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public FeeInstallment makePayment(FeeInstallment feeInstallment) {
		// TODO Auto-generated method stub
		Fee fee= feeInstallment.getFee();
		if (fee!= null) {
			long feeId = fee.getFeeId();
			Optional<Fee> res_fee= feeRepository.findById(feeId);
			if (res_fee.isPresent()) {
				feeInstallment.setFee(res_fee.get());
			}
		}
		return feeInstallmentRepository.save(feeInstallment);
	}

	@Override
	public FeeInstallment pendingInstallments(long id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(id);
		if (student.isPresent()) {
			Fee fee = feeRepository.findByStudent(student.get());
			if(fee!=null) {
				return feeInstallmentRepository.findByFee(fee);
			}
		}
		return null;
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
