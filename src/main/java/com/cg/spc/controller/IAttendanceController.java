package com.cg.spc.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;
import com.cg.spc.service.IAttendanceService;

@RestController
@RequestMapping(value = "/attendance")
public class IAttendanceController {
	
	@Autowired
	private IAttendanceService attendanceService;
	
	@PostMapping(value = "/add")
	public Attendance createAttendance(@RequestBody Attendance attendance) {
		return attendanceService.addAttendance(attendance);
		
	}

	@PutMapping(value = "/update")
	public Attendance updateAttendance(@RequestBody Attendance attendance) {
		return attendanceService.updateAttendance(attendance);
	}
	
	@PostMapping(value = "/getAttendance/{date}")
	public List<Attendance> getAttendanceByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("date") Date date) {
		return attendanceService.listAttendanceByMonth(date);

	}

	@GetMapping(value = "/getByStudent/{studentId}")
	public List<Attendance> getAttendanceByStudent(@PathVariable("studentId") int studentId) {
		return attendanceService.listAttendanceByStudent(studentId);

	}

}
