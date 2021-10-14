package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IFeeService;
import com.cg.spc.service.IStudentService;

@RestController
@RequestMapping(value = "/fee")
public class IFeeController {
	@Autowired
	private IFeeService feeService;

	@PostMapping(value = "/add")
	public Fee createFee(@RequestBody Fee fee) {
		return feeService.addFee(fee);

	}

	@PutMapping(value = "/update")
	public Fee updateFee(@RequestBody Fee fee) {
		return feeService.updateFee(fee);

	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return feeService.deleteFee(id);

	}

	@PostMapping(value = "/viewFee/Student/{id}")
	public List<Fee> getFeeByStudent(@PathVariable("id") int id) {
		return feeService.retrieveFeeByStudent(id);
	}

	@GetMapping(value = "/viewFee/month/{month}")
	public List<Fee> getFeeByMonth(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("month") Date from) {
		return feeService.retrieveAllFeeByMonth(from);
	}

	@GetMapping(value = "/viewFee/{id}")
	public Optional<Fee> getFee(@PathVariable("id") int id) {
		return feeService.retrieveFee(id);
	}
}
