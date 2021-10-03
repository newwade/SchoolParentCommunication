package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassDiary;

@Repository
public interface IClassDiaryRepository extends JpaRepository<ClassDiary, Long>{

}
