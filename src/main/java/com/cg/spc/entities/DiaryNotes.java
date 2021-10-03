package com.cg.spc.entities;

import java.util.*;

import javax.persistence.*;

@Entity(name = "DIARY_NOTES_1")
public class DiaryNotes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIARY_NOTES_ID")
	private long diaryNotesId;

//	@ElementCollection  
//	@Column(name = "NOTES")
//	private Map<Subject, String> notes;
	private String notes;

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getDiaryNotesId() {
		return diaryNotesId;
	}

	public void setDiaryNotesId(long diaryNotesId) {
		this.diaryNotesId = diaryNotesId;
	}

//	public Map<Subject, String> getNotes() {
//		return notes;
//	}
//
//	public void setNotes(Map<Subject, String> notes) {
//		this.notes = notes;
//	}

	/**
	 * @param diaryNotesId
	 * @param notes
	 */
	public DiaryNotes(long diaryNotesId, String notes) {
		super();
		this.diaryNotesId = diaryNotesId;
		this.notes = notes;
	}

	public DiaryNotes() {
		super();
	}

}
