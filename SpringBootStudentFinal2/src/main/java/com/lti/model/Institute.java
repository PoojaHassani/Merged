package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="institution_registration")
public class Institute {
	
	@Column(name="state")
	private String state;
	@Column(name="institute_name")
	private String instituteName;
	@Id
	@Column(name="institute_code")
	private int instituteCode;
	@Column(name="dise_code")
	private int diseCode;
	@Column(name="university_state")
	private String universityState;
	@Column(name="university_name")
	private String universityName;
	@Column(name="set_password")
	private String setPassword;
	
	@OneToOne(mappedBy="institute")
	private Student student;

	public Institute() {
		super();
	}

	public Institute( String state, String instituteName, int instituteCode, int diseCode,
			String universityState, String universityName, String setPassword) {
		super();
		
		this.state = state;
		this.instituteName = instituteName;
		this.instituteCode = instituteCode;
		this.diseCode = diseCode;
		this.universityState = universityState;
		this.universityName = universityName;
		this.setPassword = setPassword;
	}

	


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public int getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(int diseCode) {
		this.diseCode = diseCode;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getSetPassword() {
		return setPassword;
	}

	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}

	@Override
	public String toString() {
		return "Institue [instituteId=" + ", state=" + state + ", instituteName=" + instituteName
				+ ", instituteCode=" + instituteCode + ", discCode=" + diseCode + ", universityState=" + universityState
				+ ", universityName=" + universityName + ", setPassword=" + setPassword + "]";
	}
}