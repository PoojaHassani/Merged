package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@Component
@Entity(name = "Student")
@Table(name = "student_registration")
public class Student {
	@Id
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "domicile_state")
	private String domicileState;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "mobile_number")
	private long mobileNumber;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "aadhar_no")
	private long aadharNo;
	@Column(name = "password")
	private String studentPassword;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "institute_code")
	private Institute institute;


	

	public Student(int studentId, String domicileState, String studentName, String gender, long mobileNumber,
			String emailId, String studentPassword, boolean isInstituteVerified, boolean isNodalVerified,
			boolean isMinistryVerified) {
		super();
		this.studentId = studentId;
		this.domicileState = domicileState;
		this.studentName = studentName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.aadharNo = aadharNo;
		this.studentPassword = studentPassword;

	}

	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDomicileState() {
		return domicileState;
	}

	public void setDomicileState(String domicileState) {
		this.domicileState = domicileState;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", domicileState=" + domicileState + ", studentName=" + studentName
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", studentPassword=" + studentPassword + "]";
	}

	
}