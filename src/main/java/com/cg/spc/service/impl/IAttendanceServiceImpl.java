package com.cg.spc.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IAttendanceRepository;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IAttendanceService;

@Service
public class IAttendanceServiceImpl implements IAttendanceService {
	@Autowired
	private IAttendanceRepository attendanceRepository;

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public Attendance addAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceRepository.save(attendance);
	}

	@Override
	public Attendance updateAttendance(Attendance attendance) {
		Optional<Attendance> existingAttendanceContainer = attendanceRepository.findById(attendance.getAttendanceId());
		if (existingAttendanceContainer.isPresent()) {
			attendanceRepository.saveAndFlush(attendance);
		}
		return attendance;
	}

	@Override
	public Attendance listAttendanceByMonth(LocalDate date) {
		// TODO Auto-generated method stub
		return attendanceRepository.findByDateOfClass(date);
	}

	@Override
	public Attendance listAttendanceByStudent(int studentId) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById((long) studentId);
		if (student.isPresent()) {
			return attendanceRepository.findByStudent(student.get());
		}
		return null;
	}

}
