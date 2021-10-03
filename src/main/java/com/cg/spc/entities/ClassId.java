package com.cg.spc.entities;

import java.util.List;

import javax.persistence.*;

@Entity(name = "CLASS_ID_1")
@Embeddable
public class ClassId {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLASS_ID")
	private long classId;

	@Column(name = "GRADE")
	private int grade;

	@Column(name = "DIVISION")
	private char division;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Teacher_id")
	private Teacher classTeachers;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLASS_ID")
	private List<Teacher> subjectTeachers;

	public List<Teacher> getSubjectTeachers() {
		return subjectTeachers;
	}

	public void setSubjectTeachers(List<Teacher> subjectTeachers) {
		this.subjectTeachers = subjectTeachers;
	}

	public long getClassId() {
		return classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public Teacher getClassTeachers() {
		return classTeachers;
	}

	public void setClassTeachers(Teacher classTeachers) {
		this.classTeachers = classTeachers;
	}

	/**
	 * @param classId
	 * @param grade
	 * @param division
	 * @param classTeachers
	 * @param subjectTeachers
	 */
	public ClassId(long classId, int grade, char division, Teacher classTeachers, List<Teacher> subjectTeachers) {
		super();
		this.classId = classId;
		this.grade = grade;
		this.division = division;
		this.classTeachers = classTeachers;
		this.subjectTeachers = subjectTeachers;
	}

	/**
	 * 
	 */
	public ClassId() {
		super();
	}

	@Override
	public String toString() {
		return "ClassId [classId=" + classId + ", grade=" + grade + ", division=" + division + "]";
	}

}
