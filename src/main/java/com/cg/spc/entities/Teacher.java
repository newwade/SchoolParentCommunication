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

	public Teacher(long teacherId, String name) {
		super();
		this.teacherId = teacherId;
		this.name = name;
	}

	public Teacher() {
		super();
	}

}
