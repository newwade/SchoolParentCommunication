package com.cg.spc.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.cg.spc.entities.enums.ConcernParty;
import com.cg.spc.entities.enums.ExamType;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "EXAM_1")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXAM_ID")
	private long examId;

	@Column(name = "DATE_TIME_OF_EXAM")
	@Temporal(TemporalType.DATE)
	private Date dateOfExam;

	@Column(name = "MAX_MARKS")
	private int maxMarks;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUBJECT")
	private Subject subject;

	@Enumerated(value = EnumType.STRING)
	@Column(name = "EXAM_TYPE")
	private ExamType examType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLASS_ID")
	private ClassId classId;

	public long getExamId() {
		return examId;
	}

	public void setExamId(long examId) {
		this.examId = examId;
	}

	public Date getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public ExamType getExamType() {
		return examType;
	}

	public void setExamType(ExamType examType) {
		this.examType = examType;
	}

	public ClassId getClassId() {
		return classId;
	}

	public void setClassId(ClassId classId) {
		this.classId = classId;
	}

	/**
	 * @param examId
	 * @param dateTimeofExam
	 * @param maxMarks
	 * @param subject
	 * @param examType
	 * @param classId
	 */
	public Exam(long examId, Date dateOfExam, int maxMarks, Subject subject, ExamType examType,
			ClassId classId) {
		super();
		this.examId = examId;
		this.dateOfExam = dateOfExam;
		this.maxMarks = maxMarks;
		this.subject = subject;
		this.examType = examType;
		this.classId = classId;
	}

	public Exam() {
		super();
	}

}
