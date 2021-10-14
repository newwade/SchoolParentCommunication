package com.cg.spc.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;

public interface IFeeService {

	public Fee addFee(Fee fee);

	public String deleteFee(int id);

	public Fee updateFee(Fee fee);

	public Optional<Fee> retrieveFee(int id);

	public List<Fee> retrieveFeeByStudent(int id);

	public List<Fee> retrieveAllFeeByMonth(Date date);
}
