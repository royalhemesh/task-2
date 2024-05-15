package application;

import java.util.*;

 public class Student_Management_System_Main{
	 public static void main(String[] args) {
		 //Object area
		 Scanner sc=new Scanner(System.in);
		 StudentManagementSystem sm= new StudentManagementSystem();
		 //local variables
		String name;
		int id;
		String grade,fieldname; 
		int choice;
		int deletingid;
		int updatingid;
		boolean value=true;
		
		//user data
		while(value) {
			System.out.print("choose your Operaiton to perform\n1.create a new student Record\n2.delete a student record\n3.update a student's record\n4.show all the records:\n5.create a file with all student details\n ");
			choice=sc.nextInt();
			System.out.print("\n");
		switch(choice) {
		case 1:
			 System.out.println("enter the minimum details of the student");
			 System.out.println("name:");
			 name=sc.next();
			 System.out.println("Rollnumber:");
			 id=sc.nextInt();
			 System.out.println("Grade:");
			 grade=sc.next();
			 Student st=new Student(id,name,grade);
			sm.addStudent(st); 
			 System.out.println("record created successfully");
			 System.out.print("\n");
			 break;
		case 2:
			System.out.println("enter the id which do you want to delete");
			deletingid=sc.nextInt();
			sm.deleteStudent(deletingid);
			sm.viewStudents();
			System.out.print("\n");
			break;
		case 3:
			System.out.println("enter the id to update");
			updatingid=sc.nextInt();
			System.out.print("enter your field name to update\n1:name\n2:grade\n");
		    fieldname=sc.next();
		    System.out.println("enter the new value to update");
		    String updatedvalue = sc.next();
		    sm.updateStudent(updatingid,fieldname,updatedvalue);
		    break;
		case 4:
			sm.viewStudents();
			System.out.println("\n");
			break;
		case 5:
			String filePath = "E:/internship/Arthmatic_operations";
			sm.Filecreation(filePath);
			}
		}
	 }
 }