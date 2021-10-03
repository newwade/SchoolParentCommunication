package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;

public interface IConcernService {
	public Concern addConcern(Concern concern);

	public Concern updateConcern(Concern concern);

	public List<Concern> concerns();

	public Concern concernsByParent(int parentId);

	public List<Concern> unResolvedConcerns();

	public Concern unResolvedConcernsByParent(int parentId);

}
