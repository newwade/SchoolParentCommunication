package com.cg.spc.service.impl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IFeeInstallmentRepository;
import com.cg.spc.repository.IFeeRepository;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IFeeService;

@Service
public class IFeeServiceImpl implements IFeeService {

	@Autowired
	private IFeeRepository feeRepository;

	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public Fee addFee(Fee fee) {
		Student student = fee.getStudent();
		if (student != null) {
			long studentId = student.getUserId();
			Optional<Student> res_student = studentRepo.findById(studentId);
			if (res_student.isPresent()) {
				fee.setStudent(res_student.get());
			}
		}
		return feeRepository.save(fee);
	}

	@Override
	public String deleteFee(int id) {
		// TODO Auto-generated method stub
		feeRepository.deleteById((long) id);
		return "Fee with the id " + id + "payed";
	}

	@Override
	public Fee updateFee(Fee fee) {
		// TODO Auto-generated method stub
		Optional<Fee> existingFeeContainer = feeRepository.findById((long) fee.getFeeId());
		if (existingFeeContainer.isPresent()) {
			feeRepository.saveAndFlush(fee);
		}
		return fee;
	}

	@Override
	public Optional<Fee> retrieveFee(int id) {
		// TODO Auto-generated method stub
		return feeRepository.findById((long) id);
	}

	@Override
	public Fee retrieveFeeByStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepo.findById((long) id);
		if (student.isPresent()) {
			return feeRepository.findByStudent(student.get());
		}
		return null;

	}

	/*
	 * @param(LocalDate date) intial - receives (int month)->gets list of fees for a
	 * specific month
	 */

	@Override
	public Fee retrieveAllFeeByMonth(LocalDate date) {

		return feeRepository.findByStartMonthYear(date);
	}

}
