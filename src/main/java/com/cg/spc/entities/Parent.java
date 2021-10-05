package com.cg.spc.entities;

import java.util.List;

import javax.persistence.*;

@Entity(name = "PARENT_1")
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PARENT_ID")
	private long parentId;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT")
	private Student student;

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @param parentId
	 * @param mobileNumber
	 * @param emailId
	 * @param student
	 */
	public Parent(long parentId, String mobileNumber, String emailId, Student student) {
		super();
		this.parentId = parentId;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.student = student;
	}

	public Parent() {
		super();
	}

}
