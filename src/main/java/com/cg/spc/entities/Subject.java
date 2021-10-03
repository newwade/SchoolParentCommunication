package com.cg.spc.entities;

import javax.persistence.*;

@Entity(name = "SUBJECT_1")
@Embeddable  
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUBJECT_ID")
	private long subjectId;

	@Column(name = "TITLE")
	private String title;

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Subject(long subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}

	public Subject() {
		super();
	}

}
