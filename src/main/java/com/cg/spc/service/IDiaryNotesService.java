package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Subject;

public interface IDiaryNotesService {

	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes);

	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes);

	public Optional<DiaryNotes> deleteDiaryNotes(int diaryNotesId);

	public Optional<DiaryNotes>retrieveDiaryNotesById(long id);

	public List<DiaryNotes> retrieveAllDiaryNotes();

//	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate localDate);
//
//	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject);

}
