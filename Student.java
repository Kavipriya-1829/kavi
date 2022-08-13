package com.student;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentClass;
	private long studentContact;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int studentId, String studentName, String studentAddress, String studentClass, long studentContact) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentClass = studentClass;
		this.studentContact = studentContact;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public String getStudentClass() {
		return studentClass;
	}


	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}


	public long getStudentContact() {
		return studentContact;
	}


	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentClass=" + studentClass + ", studentContact=" + studentContact + "]";
	}
	
	
	
	
	

}
