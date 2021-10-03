package com.cg.spc.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Subject;
import com.cg.spc.repository.IConcernRepository;
import com.cg.spc.repository.IDiaryNotesRepository;
import com.cg.spc.service.IDiaryNotesService;

@Service
public class IDiaryNotesServiceImpl implements IDiaryNotesService {
	@Autowired
	private IDiaryNotesRepository diaryNotesRepository;

	@Override
	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes) {
		// TODO Auto-generated method stub
		return diaryNotesRepository.save(diaryNotes);
	}

	@Override
	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes) {
		// TODO Auto-generated method stub
		Optional<DiaryNotes> optional = diaryNotesRepository.findById(diaryNotes.getDiaryNotesId());
		if (optional.isPresent()) {
			diaryNotesRepository.saveAndFlush(diaryNotes);
		}
		return diaryNotes;
	}

	@Override
	public Optional<DiaryNotes> deleteDiaryNotes(int diaryNotesId) {
		// TODO Auto-generated method stub
		Optional<DiaryNotes> diaryNotes = diaryNotesRepository.findById((long) diaryNotesId);
		if (diaryNotes.isPresent()) {
			diaryNotesRepository.deleteById((long) diaryNotesId);
		}

		return diaryNotes;
	}

	@Override
	public Optional<DiaryNotes> retrieveDiaryNotesById(long id) {
		// TODO Auto-generated method stub
		return diaryNotesRepository.findById(id);
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes() {
		// TODO Auto-generated method stub
		return diaryNotesRepository.findAll();
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate localDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject) {
		// TODO Auto-generated method stub
		return diaryNotesRepository.findAll();
	}

}
