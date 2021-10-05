package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.service.IConcernService;

@RestController
@RequestMapping(value = "/concern")
public class IConcernController {

	@Autowired
	private IConcernService concernService;

	@PostMapping(value = "/add")
	public Concern createConcern(@RequestBody Concern concern) {
		return concernService.addConcern(concern);

	}

	@PutMapping(value = "/update")
	public Concern updateConcern(@RequestBody Concern concern) {
		return concernService.updateConcern(concern);

	}

	@GetMapping(value = "/getAllConcerns")
	public List<Concern> getAllConcerns() {
		return concernService.concerns();
	}

	@GetMapping(value = "/getParentConcerns/{parentId}")
	public Concern getConcernsByParent(@PathVariable("parentId") int parentId) {
		return concernService.concernsByParent(parentId);
	}

	@GetMapping(value = "/getUnResolved/concerns")
	public List<Concern> getUnResolvedConcerns() {
		return concernService.unResolvedConcerns();
	}

	@PostMapping(value = "/getUnResolved/{parentId}/")
	public Concern getUnResolvedConcernsByParent(@PathVariable("parentId") int parentId) {
		return concernService.unResolvedConcernsByParent(parentId);
	}

}
