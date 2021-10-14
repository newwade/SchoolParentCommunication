package com.cg.spc.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "FEE_1")
public class Fee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FEE_ID")
	private long feeId;

	@Column(name = "TOTAL_FEES_DUE")
	private double totalFeesDue;

	@Column(name = "TOTAL_FEES_RECEIVED")
	private double totalFeesReceived;

	@Column(name = "STARTING_MONTH")
	@Temporal(TemporalType.DATE)
	private Date startMonthYear;

	@Column(name = "ENDING_MONTH")
	@Temporal(TemporalType.DATE)
	private Date endMonthYear;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT")
	private Student student;

	public long getFeeId() {
		return feeId;
	}

	public void setFeeId(long feeId) {
		this.feeId = feeId;
	}

	public double getTotalFeesDue() {
		return totalFeesDue;
	}

	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}

	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}

	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}

	public Date getStartMonthYear() {
		return startMonthYear;
	}

	public void setStartMonthYear(Date startMonthYear) {
		this.startMonthYear = startMonthYear;
	}

	public Date getEndMonthYear() {
		return endMonthYear;
	}

	public void setEndMonthYear(Date endMonthYear) {
		this.endMonthYear = endMonthYear;
	}

	public Fee(long feeId, double totalFeesDue, double totalFeesReceived, Date startMonthYear,
			Date endMonthYear,Student student) {
		super();
		this.feeId = feeId;
		this.totalFeesDue = totalFeesDue;
		this.totalFeesReceived = totalFeesReceived;
		this.startMonthYear = startMonthYear;
		this.endMonthYear = endMonthYear;
		this.student=student;
	}

	public Fee() {
		super();
	}

}
