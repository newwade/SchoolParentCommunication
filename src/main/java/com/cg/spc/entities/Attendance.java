package com.cg.spc.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity(name = "ATTENDANCE")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ATTENDANCE_ID")
	private long attendanceId;

	@Column(name = "DATE_OF_CLASS")
	@Temporal(TemporalType.DATE)
	private Date dateOfClass;

	@Column(name = "PRESENT")
	private boolean present;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "STUDENT")
	private Student student;

	public long getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(long attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Date getDateOfClass() {
		return dateOfClass;
	}

	public void setDateOfClass(Date dateOfClass) {
		this.dateOfClass = dateOfClass;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @param attendanceId
	 * @param dateOfClass
	 * @param present
	 * @param student
	 */
	public Attendance(long attendanceId, Date dateOfClass, boolean present, Student student) {
		super();
		this.attendanceId = attendanceId;
		this.dateOfClass = dateOfClass;
		this.present = present;
		this.student = student;
	}

	public Attendance() {
		super();
	}

}

