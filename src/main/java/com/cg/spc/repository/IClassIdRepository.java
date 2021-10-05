package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.ClassId;

@Repository
public interface IClassIdRepository extends JpaRepository<ClassId, Long>{

}
