package com.cg.spc.entities;

import javax.persistence.*;

@Entity(name = "STUDENT_EXAM_ATTEMPT_1")
public class StudentExamAttempt {

	
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_EXAM_ATTEMPT_ID")
	private long studentExamAttemptId;

	@Column(name = "ATTEMPTED")
	private boolean attempted;

	@Column(name = "MARKS_OBTAINED")
	private int marksObtained;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EXAM")
	private Exam exam;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT")
	private Student student;

	public long getStudentExamAttemptId() {
		return studentExamAttemptId;
	}

	public void setStudentExamAttemptId(long studentExamAttemptId) {
		this.studentExamAttemptId = studentExamAttemptId;
	}

	public boolean isAttempted() {
		return attempted;
	}

	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	/**
	 * @param studentExamAttemptId
	 * @param attempted
	 * @param marksObtained
	 * @param exam
	 * @param student
	 */
	public StudentExamAttempt(long studentExamAttemptId, boolean attempted, int marksObtained, Exam exam,
			Student student) {
		super();
		this.studentExamAttemptId = studentExamAttemptId;
		this.attempted = attempted;
		this.marksObtained = marksObtained;
		this.exam = exam;
		this.student = student;
	}

	public StudentExamAttempt() {
		super();
	}

}
