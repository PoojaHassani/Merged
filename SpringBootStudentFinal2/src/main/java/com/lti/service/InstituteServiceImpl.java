package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.InstituteDao;
import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;
@Service("service")
public class InstituteServiceImpl implements InstituteService {
	@Autowired
	private InstituteDao dao;

	public InstituteDao getDao() {
		return dao;
	}

	public void setDao(InstituteDao dao) {
		this.dao = dao;
	}
	@Override
	public boolean addInstitute(Institute institute) {
		int result = dao.createInstitute(institute);
		if (result == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean loginInstitute(int instituteCode, String setPassword) {
		int result=dao.loginInstitute(instituteCode, setPassword);
		
		if(result == 1){
			return true;
		}
		return false;
	}

	@Override
	public Student studentLogin(long aadharNo, String password) {
		Student result=dao.loginStudent(aadharNo, password);
		return result;
	}

	@Override
	public boolean addStudent(Student student) {
		int result = dao.createStudent(student);
		if (result == 1)
		return true;
		else
		
			return false;
	}

	@Override
	public boolean addStudentScheme(Scheme scheme) {
		int result = dao.insertStudentScheme(scheme);
		if (result == 1)
			return true;
		else
			return false;
		
	}
}


