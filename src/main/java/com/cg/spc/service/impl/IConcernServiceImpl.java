package com.cg.spc.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IConcernRepository;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.service.IConcernService;

@Service
public class IConcernServiceImpl implements IConcernService {

	@Autowired
	private IConcernRepository concernRepository;

	@Autowired
	private IParentRepository parentRepository;

	@Override
	public Concern addConcern(Concern concern) {
		// TODO Auto-generated method stub
		return concernRepository.save(concern);
	}

	@Override
	public Concern updateConcern(Concern concern) {
		// TODO Auto-generated method stub
		Optional<Concern> existingConcernContainer = concernRepository.findById((long) concern.getConcernId());
		if (existingConcernContainer.isPresent()) {
			concernRepository.saveAndFlush(concern);
		}
		return concern;
	}

	@Override
	public List<Concern> concerns() {
		// TODO Auto-generated method stub
		return concernRepository.findAll();
	}

	@Override
	public Concern concernsByParent(int parentId) {
		// TODO Auto-generated method stub
		Optional<Parent> parent = parentRepository.findById((long) parentId);
		if (parent.isPresent()) {
			return concernRepository.findByParent(parent.get());
		}
		return null;

	}

	@Override
	public List<Concern> unResolvedConcerns() {
		List<Concern> concerns = concernRepository.findAll();
		List<Concern> unResolvedConcerns = concerns.stream().filter(l1 -> !l1.isResolved())
				.collect(Collectors.toList());
		return unResolvedConcerns;
	}

	@Override
	public Concern unResolvedConcernsByParent(int parentId) {
		// TODO Auto-generated method stub
		Optional<Parent> parent = parentRepository.findById((long) parentId);
		Concern concerns = null;
		if (parent.isPresent()) {
			concerns = concernRepository.findByParent(parent.get());
		}
		if (!concerns.isResolved()) {
			if ((concerns.getConcernParty() + "").equals("PARENT")) {
				return concerns;
			}
			return null;
		}
		return null;
	}

}
