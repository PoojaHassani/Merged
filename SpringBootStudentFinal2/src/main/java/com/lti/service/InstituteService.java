package com.lti.service;

import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;

public interface InstituteService {
	public boolean addInstitute(Institute institute);
	public boolean loginInstitute(int instituteCode,String setPassword);
	public Student studentLogin(long aadharNo,String password);
	public boolean addStudent(Student student);
	public boolean addStudentScheme(Scheme scheme);
}