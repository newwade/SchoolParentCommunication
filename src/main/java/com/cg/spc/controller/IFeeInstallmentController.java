package com.cg.spc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IFeeInstallmentService;
import com.cg.spc.service.IParentService;

@RestController
@RequestMapping(value = "/api")
public class IFeeInstallmentController {
	@Autowired
	private IFeeInstallmentService feeInstallmentService;

	@PostMapping(value = "/addPayment")
	public FeeInstallment createFeeInstallment(@RequestBody FeeInstallment feeInstallment) {
		return feeInstallmentService.makePayment(feeInstallment);
	}

	@PostMapping(value = "/viewPending")
	public List<FeeInstallment> getPendingInstallments(@RequestBody Student student) {
		return feeInstallmentService.pendingInstallments(student);
	}

	@GetMapping(value = "/viewFeeInstallment/{id}")
	public Optional<FeeInstallment> getFeeInstallment(@PathVariable("id") int id) {
		return feeInstallmentService.retrieveFeeInstallmentById(id);
	}

	@PostMapping(value = "/viewAll/Fee/{feeId}")
	public FeeInstallment getAllFeeInstallment(@PathVariable("feeId") int feeId) {
		return feeInstallmentService.retrieveAllFeeInstallmentsByFee(feeId);
	}

}
