package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "FEE_INSTALLMENT_1")
public class FeeInstallment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FEE_INSTALLMENT_ID")
	private long feeInstallmentId;

	@Column(name = "FEE_INSTALLMENT")
	private double feeInstallment;

	@Column(name = "DUE_DATE")
	private LocalDate dueDate;

	@Column(name = "FEE_PAYMENT_DATE")
	private LocalDate feePaymentDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FEE_COLUMN")
	private Fee fee;

	public long getFeeInstallmentId() {
		return feeInstallmentId;
	}

	public void setFeeInstallmentId(long feeInstallmentId) {
		this.feeInstallmentId = feeInstallmentId;
	}

	public double getFeeInstallment() {
		return feeInstallment;
	}

	public void setFeeInstallment(double feeInstallment) {
		this.feeInstallment = feeInstallment;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getFeePaymentDate() {
		return feePaymentDate;
	}

	public void setFeePaymentDate(LocalDate feePaymentDate) {
		this.feePaymentDate = feePaymentDate;
	}

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	/**
	 * @param feeInstallmentId
	 * @param feeInstallment
	 * @param dueDate
	 * @param feePaymentDate
	 * @param fee
	 */
	public FeeInstallment(long feeInstallmentId, double feeInstallment, LocalDate dueDate, LocalDate feePaymentDate,
			Fee fee) {
		super();
		this.feeInstallmentId = feeInstallmentId;
		this.feeInstallment = feeInstallment;
		this.dueDate = dueDate;
		this.feePaymentDate = feePaymentDate;
		this.fee = fee;
	}

	public FeeInstallment() {
		super();
	}

}
