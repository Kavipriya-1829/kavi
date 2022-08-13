package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StudentApp {
	
	ArrayList<Student> studentList=new ArrayList<Student>();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StudentApp()
	{
		studentList.add(new Student(101,"Raman","Mumbai","V",9876453));
		studentList.add(new Student(102,"Suman","Chennai","V",9776453));
		studentList.add(new Student(103,"Krishna","Delhi","V",7676453));
	}
	
	
	public void deleteStudentById() throws NumberFormatException, IOException
	{
		System.out.println("Enter student id :");
		int studentId=Integer.parseInt(br.readLine());
		int index=0,flag=0;
		Student s=null;
		
		for(Student student:studentList)
		{
			if(studentId==student.getStudentId())
			{
				flag=1;
				index=studentList.indexOf(student);
				s=student;
				System.out.println(index);
				break;
			}
		}
		System.out.println("==================================================================================================");

		if(flag==0)
		{
			System.out.println("Student Id does not exist!!");
		}
		else
		{
			studentList.remove(s);
			System.out.println("Student record deleted successfully!!");
		}
		
		System.out.println("==================================================================================================");

	}
	
	
	public void addStudentInfo() throws NumberFormatException, IOException
	{
		System.out.println("Enter student Id: ");
		int studentId=Integer.parseInt(br.readLine());
		System.out.println("Enter student Name: ");
		String studentName=br.readLine();
		System.out.println("Enter student Address: ");
		String studentAddress=br.readLine();
		System.out.println("Enter student class: ");
		String studentClass=br.readLine();
		System.out.println("Enter student Contact: ");
		long studentContact=Long.parseLong(br.readLine());
		
		Student s=new Student(studentId, studentName, studentAddress, studentClass, studentContact);
		
		studentList.add(s);
	}
	
	
	public void viewStudentInfoById() throws NumberFormatException, IOException
	{
		System.out.println("Enter student id:");
		int studentId=Integer.parseInt(br.readLine());
	    int flag=0;
		System.out.println("==================================================================================================");

		for(Student s:studentList)
		{
			if(studentId==s.getStudentId())
			{   flag=1;
				System.out.println("Student Name:"+s.getStudentName()+"\t Class:"+s.getStudentClass()+"\t Address:"+s.getStudentAddress()+"\t Contact:"+s.getStudentContact());
			}
		}
		
		if(flag==0)
			System.out.println("Student Id does not exist!!");
		System.out.println("==================================================================================================");
	
	}
	
	
	public void viewAllStudentInfo()
	{   		
		System.out.println("==================================================================================================");

		if(studentList.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Student s:studentList)
		{
			
				System.out.println("Student Name:"+s.getStudentName()+"\t Class:"+s.getStudentClass()+"\t Address:"+s.getStudentAddress()+"\t Contact:"+s.getStudentContact());
			
		}
		System.out.println("==================================================================================================");

	}
	
	
	public void deleteAllStudentInfo()
	{
		System.out.println("==================================================================================================");

		if(studentList.size()>0)
		{
			studentList.clear();
			System.out.println("All records deleted successfully!!");
		}
		else
		{
			System.out.println("No record available!!");
		}
		System.out.println("==================================================================================================");

	}
	
	
	public void updateStudentById() throws NumberFormatException, IOException
	{
		System.out.println("Enter student id:");
		int studentId=Integer.parseInt(br.readLine());
	    int flag=0,index = 0;
	    Student s=null;
	    for(Student student:studentList)
	    {
	    	if(student.getStudentId()==studentId)
	    	{
	    		flag=1;
	    		index=studentList.indexOf(student);
	    		s=student;
	    		break;
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	System.out.println("Enter student Name: ");
			String studentName=br.readLine();
			System.out.println("Enter student Address: ");
			String studentAddress=br.readLine();
			System.out.println("Enter student class: ");
			String studentClass=br.readLine();
			System.out.println("Enter student Contact: ");
			long studentContact=Long.parseLong(br.readLine());
			
			s.setStudentName(studentName);
			s.setStudentAddress(studentAddress);
			s.setStudentClass(studentClass);
			s.setStudentContact(studentContact);
			
			studentList.set(index,s);
			System.out.println("==================================================================================================");

			System.out.println("Student Details updated!!");
	    }
	    else
	    {
	    	System.out.println("Id does not exist!!");
	    }
		System.out.println("==================================================================================================");

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("====================================================================");
		System.out.println("============= Student Management System =============================");
		System.out.println("====================================================================");
		String ch=null;
		StudentApp app=new StudentApp();
		do
		{
		
		System.out.println("\t\t 1)Insert Student Information\r\n"
				+ "\t\t 2)View student info by student id.\r\n"
				+ "\t\t 3)view all student information.\r\n"
				+ "\t\t 4)Update student information by id.\r\n"
				+ "\t\t 5)delete student information by id.\r\n"
				+ "\t\t 6)delete all student information.");
		System.out.println("====================================================================");
		System.out.println("Enter your choice:");
		int choice=Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1: app.addStudentInfo();
			    System.out.println("Student Information inserted!!");
			    break;			    
		case 2:	app.viewStudentInfoById();
				break;
		case 3:	app.viewAllStudentInfo();
				break;
		case 4:	app.updateStudentById();
				break;		
		case 5: app.deleteStudentById();
				break;
		case 6:	app.deleteAllStudentInfo();
				break;		
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		ch=br.readLine();
		}
		while(ch.equals("Y")||ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");

		
	}

}
