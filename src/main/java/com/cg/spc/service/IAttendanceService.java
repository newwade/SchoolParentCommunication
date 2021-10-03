package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;

public interface IAttendanceService {

	public Attendance addAttendance(Attendance attendance);

	public Attendance updateAttendance(Attendance attendance);

	public Attendance listAttendanceByMonth(LocalDate date);

	public Attendance listAttendanceByStudent(int studentId);

}
