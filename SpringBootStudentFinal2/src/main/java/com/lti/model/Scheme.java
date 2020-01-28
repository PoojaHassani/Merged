package com.lti.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "scheme")
public class Scheme {
	// @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="")
	// @SequenceGenerator(sequenceName="",name= "",
	// initialValue=1,allocationSize=1)
	@Id
	@Column(name = "sid")
	private int studentNo;
	@Column(name = "Religion")
	private String religion;
	@Column(name = "Community")
	private String community;
	@Column(name = "Father_Name")
	private String fatherName;
	@Column(name = "Mother_Name")
	private String motherName;
	@Column(name = "Institute_Name")
	private String instituteName;
	@Column(name = "Present_Course")
	private String presentcourse;
	@Column(name = "Present_Course_Year")
	private int presentCourseYear;
	@Column(name = "Family_Income")
	private double familyincome;
	@Column(name = "Mode_Of_Study")
	private String modeOfStudy;
	@Column(name = "Start_Date")
	private String startDate;
	@Column(name = "University")
	private String university;
	@Column(name = "Previous_Course")
	private String previousCourse;
	@Column(name = "Previous_Passing_Year")
	private int previousPassingYear;
	@Column(name = "Previous_Percentage")
	private int previouspercentage;
	@Column(name = "Tenth_Roll_number")
	private int tenthRollNumber;
	@Column(name = "Tenth_Board")
	private String tenthBoard;
	@Column(name = "Tenth_Pass_Year")
	private int tenthPassYear;
	@Column(name = "Tenth_Percentage")
	private double tenthpercentage;
	@Column(name = "Roll_Number_12")
	private int twelveRollNumber;
	@Column(name = "Board_12")
	private String twelveBoard;
	@Column(name = "Pass_Year_12")
	private int twelevePassYear;
	@Column(name = "Percentage_12")
	private double twelvePercentage;
	@Column(name = "Admission_Fee")
	private double admissionFee;
	@Column(name = "Tution_Fee")
	private double tutionFee;
	@Column(name = "Other_Fee")
	private double otherFee;
	@Column(name = "bank_account_number")
	private long bankAccountNumber;
	@Column(name = "bank_IFSC_code")
	private String bankIfscCode;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "Is-Disabled")
	private String isDisabled;
	@Column(name = "Type_Of_Disability")
	private String typeOfDisability;
	@Column(name = "Disability_Percentage")
	private double disabilityPercentage;
	@Column(name = "Marital_Status")
	private String maritialStatus;
	@Column(name = "State")
	private String state;
	@Column(name = "District")
	private String district;
	@Column(name = "Taluka")
	private String taluka;
	@Column(name = "House_No")
	private int houseNo;
	@Column(name = "Pincode")
	private int pincode;
	@Column(name = "Scheme_Applied")
	private String schemeApplied;

	public Scheme() {

	}

	public Scheme(int studentNo, String religion, String community, String fatherName, String motherName,
			String instituteName, String presentcourse, int presentCourseYear, double familyincome, String modeOfStudy,
			String startDate, String university, String previousCourse, int previousPassingYear, int previouspercentage,
			int tenthRollNumber, String tenthBoard, int tenthPassYear, double tenthpercentage, int twelveRollNumber,
			String twelveBoard, int twelevePassYear, double twelvePercentage, double admissionFee, double tutionFee,
			double otherFee, long bankAccountNumber, String bankIfscCode, String bankName, String isDisabled,
			String typeOfDisability, double disabilityPercentage, String maritialStatus, 
			String state, String district, String taluka, int houseNo, int pincode, String schemeApplied) {
		super();
		this.studentNo = studentNo;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.instituteName = instituteName;
		this.presentcourse = presentcourse;
		this.presentCourseYear = presentCourseYear;
		this.familyincome = familyincome;
		this.modeOfStudy = modeOfStudy;
		this.startDate = startDate;
		this.university = university;
		this.previousCourse = previousCourse;
		this.previousPassingYear = previousPassingYear;
		this.previouspercentage = previouspercentage;
		this.tenthRollNumber = tenthRollNumber;
		this.tenthBoard = tenthBoard;
		this.tenthPassYear = tenthPassYear;
		this.tenthpercentage = tenthpercentage;
		this.twelveRollNumber = twelveRollNumber;
		this.twelveBoard = twelveBoard;
		this.twelevePassYear = twelevePassYear;
		this.twelvePercentage = twelvePercentage;
		this.admissionFee = admissionFee;
		this.tutionFee = tutionFee;
		this.otherFee = otherFee;
		this.bankAccountNumber = bankAccountNumber;
		this.bankIfscCode = bankIfscCode;
		this.bankName = bankName;
		this.isDisabled = isDisabled;
		this.typeOfDisability = typeOfDisability;
		this.disabilityPercentage = disabilityPercentage;
		this.maritialStatus = maritialStatus;
		this.state = state;
		this.district = district;
		this.taluka = taluka;
		this.houseNo = houseNo;
		this.pincode = pincode;
		this.schemeApplied = schemeApplied;
	}

	public int getStudentId() {
		return studentNo;
	}

	public void setStudentId(int studentId) {
		this.studentNo = studentNo;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getPresentcourse() {
		return presentcourse;
	}

	public void setPresentcourse(String presentcourse) {
		this.presentcourse = presentcourse;
	}

	public int getPresentCourseYear() {
		return presentCourseYear;
	}

	public void setPresentCourseYear(int presentCourseYear) {
		this.presentCourseYear = presentCourseYear;
	}

	public double getFamilyincome() {
		return familyincome;
	}

	public void setFamilyincome(double familyincome) {
		this.familyincome = familyincome;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPreviousCourse() {
		return previousCourse;
	}

	public void setPreviousCourse(String previousCourse) {
		this.previousCourse = previousCourse;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	public int getPreviouspercentage() {
		return previouspercentage;
	}

	public void setPreviouspercentage(int previouspercentage) {
		this.previouspercentage = previouspercentage;
	}

	public int getTenthRollNumber() {
		return tenthRollNumber;
	}

	public void setTenthRollNumber(int tenthRollNumber) {
		this.tenthRollNumber = tenthRollNumber;
	}

	public String getTenthBoard() {
		return tenthBoard;
	}

	public void setTenthBoard(String tenthBoard) {
		this.tenthBoard = tenthBoard;
	}

	public int getTenthPassYear() {
		return tenthPassYear;
	}

	public void setTenthPassYear(int tenthPassYear) {
		this.tenthPassYear = tenthPassYear;
	}

	public double getTenthpercentage() {
		return tenthpercentage;
	}

	public void setTenthpercentage(double tenthpercentage) {
		this.tenthpercentage = tenthpercentage;
	}

	public int getTwelveRollNumber() {
		return twelveRollNumber;
	}

	public void setTwelveRollNumber(int twelveRollNumber) {
		this.twelveRollNumber = twelveRollNumber;
	}

	public String getTwelveBoard() {
		return twelveBoard;
	}

	public void setTwelveBoard(String twelveBoard) {
		this.twelveBoard = twelveBoard;
	}

	public int getTwelevePassYear() {
		return twelevePassYear;
	}

	public void setTwelevePassYear(int twelevePassYear) {
		this.twelevePassYear = twelevePassYear;
	}

	public double getTwelvePercentage() {
		return twelvePercentage;
	}

	public void setTwelvePercentage(double twelvePercentage) {
		this.twelvePercentage = twelvePercentage;
	}

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public String isDisabled() {
		return isDisabled;
	}

	public void setDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getTypeOfDisability() {
		return typeOfDisability;
	}

	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public double getDisabilityPercentage() {
		return disabilityPercentage;
	}

	public void setDisabilityPercentage(double disabilityPercentage) {
		this.disabilityPercentage = disabilityPercentage;
	}

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getSchemeApplied() {
		return schemeApplied;
	}

	public void setSchemeApplied(String schemeApplied) {
		this.schemeApplied = schemeApplied;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankIfscCode() {
		return bankIfscCode;
	}

	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Scheme [studentNo=" + studentNo + ", religion=" + religion + ", community=" + community
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", instituteName=" + instituteName
				+ ", presentcourse=" + presentcourse + ", presentCourseYear=" + presentCourseYear + ", familyincome="
				+ familyincome + ", modeOfStudy=" + modeOfStudy + ", startDate=" + startDate + ", university="
				+ university + ", previousCourse=" + previousCourse + ", previousPassingYear=" + previousPassingYear
				+ ", previouspercentage=" + previouspercentage + ", tenthRollNumber=" + tenthRollNumber
				+ ", tenthBoard=" + tenthBoard + ", tenthPassYear=" + tenthPassYear + ", tenthpercentage="
				+ tenthpercentage + ", twelveRollNumber=" + twelveRollNumber + ", twelveBoard=" + twelveBoard
				+ ", twelevePassYear=" + twelevePassYear + ", twelvePercentage=" + twelvePercentage + ", admissionFee="
				+ admissionFee + ", tutionFee=" + tutionFee + ", otherFee=" + otherFee + ", bankAccountNumber="
				+ bankAccountNumber + ", bankIfscCode=" + bankIfscCode + ", bankName=" + bankName + ", isDisabled="
				+ isDisabled + ", typeOfDisability=" + typeOfDisability + ", disabilityPercentage="
				+ disabilityPercentage + ", maritialStatus=" + maritialStatus
				 + ", state=" + state + ", district=" + district + ", taluka=" + taluka
				+ ", houseNo=" + houseNo + ", pincode=" + pincode + ", schemeApplied=" + schemeApplied + "]";
	}

}
