package com.cg.spc.entities;

import java.util.*;

import javax.persistence.*;

@Entity(name = "TEACHER_1")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TEACHER_ID")
	private long teacherId;

	@Column(name = "TEACHER_NAME")
	private String name;

//	@ElementCollection
//	@ManyToOne(targetEntity=ClassId.class)
//	@JoinColumn(name = "SUBJECT_CLASSES",nullable = true)
//	private Map<Subject, List<ClassId>> subjectClasses;

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Map<Subject, List<ClassId>> getSubjectClasses() {
//		return subjectClasses;
//	}
//
//	public void setSubjectClasses(Map<Subject, List<ClassId>> subjectClasses) {
//		this.subjectClasses = subjectClasses;
//	}

	public Teacher(long teacherId, String name) {
		super();
		this.teacherId = teacherId;
		this.name = name;
//		this.subjectClasses = subjectClasses;
	}

	public Teacher() {
		super();
	}

}
