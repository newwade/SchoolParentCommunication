package com.cg.spc.entities;

import java.util.List;

import javax.persistence.*;

@Entity(name = "CLASS_DIARY")
public class ClassDiary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLASS_DIARY_ID")
	private long classDiaryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DIARY_NOTES")
	private DiaryNotes diaryNotes;

	public long getClassDiaryId() {
		return classDiaryId;
	}

	public void setClassDiaryId(long classDiaryId) {
		this.classDiaryId = classDiaryId;
	}

	public DiaryNotes getDiaryNotes() {
		return diaryNotes;
	}

	public void setDiaryNotes(DiaryNotes diaryNotes) {
		this.diaryNotes = diaryNotes;
	}

	/**
	 * @param classDiaryId
	 * @param diaryNotes
	 */
	public ClassDiary(long classDiaryId, DiaryNotes diaryNotes) {
		super();
		this.classDiaryId = classDiaryId;
		this.diaryNotes = diaryNotes;
	}

	public ClassDiary() {
		super();
	}

}
