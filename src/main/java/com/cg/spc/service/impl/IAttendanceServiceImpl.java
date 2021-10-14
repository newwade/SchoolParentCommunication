package com.cg.spc.service.impl;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
		Student student = attendance.getStudent();
		if(student!=null) {
			long studentId = student.getUserId();
			Optional<Student> res_student=studentRepository.findById(studentId);
			if(res_student.isPresent()) {
				attendance.setStudent(res_student.get());
			}
		}
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
	public List<Attendance> listAttendanceByMonth(Date date) {
		// TODO Auto-generated method stub
		List<Attendance> attendance= attendanceRepository.findByDateOfClass(date);
		Collections.sort(attendance,new Comparator<Attendance>() {
			public int compare(Attendance m1,Attendance m2) {return m1.getDateOfClass().compareTo(m2.getDateOfClass());}
		});
		return attendance;
		
	}

	@Override
	public List<Attendance> listAttendanceByStudent(int studentId) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById((long) studentId);
		if (student.isPresent()) {
			return attendanceRepository.findByStudent(student.get());
		}
		return null;
	}

}
