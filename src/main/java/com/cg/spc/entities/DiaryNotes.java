package com.cg.spc.entities;

import java.util.*;

import javax.persistence.*;

@Entity(name = "DIARY_NOTES_1")
public class DiaryNotes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIARY_NOTES_ID")
	private long diaryNotesId;


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
