package com.lti.dao;

import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;

public interface InstituteDao {
	public int createInstitute(Institute institute);
	public int loginInstitute(int instituteCode,String setPassword);
	public Student loginStudent(long aadharNo,String password);
	public int createStudent(Student student);
	public int insertStudentScheme(Scheme scheme);
}