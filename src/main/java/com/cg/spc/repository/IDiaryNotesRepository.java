package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.DiaryNotes;

@Repository
public interface IDiaryNotesRepository extends JpaRepository<DiaryNotes, Long> {

}
