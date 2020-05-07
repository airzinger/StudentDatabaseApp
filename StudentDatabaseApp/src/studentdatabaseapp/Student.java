package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor : prompt's user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Enter student's class level:\n1 for freshman\n2 - Sophomore\n"
				+ "3 - Junior\n4 - Senior");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		//System.out.println(firstName +" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	//Generate an ID
	private void setStudentID() {
		//grade level + ID
		studentID = gradeYear+""+id;
		id++;
		
	}
	
	//Enroll in courses
	public void enroll() {
		//get inside a loop
		String course = "";
		while(!course.equals("Q")) {
			System.out.println("Enter course to emroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			course = in.nextLine();
				if(!course.equals("Q")) {
				courses += "\n" + course;
				tuitionBalance+=costOfCourse;
				}
			}
		
		//System.out.println("Enrolled in: "+courses);
		//System.out.println("Tuition Balance: "+tuitionBalance);
	}
	//View Balance
	public void viewBalance() {
		System.out.println("Your balance is: INR"+tuitionBalance);
	}
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter the payment you wish to do: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance-=payment;
		System.out.println("Thankyou for your payment of INR"+payment);
		//viewBalance();
	}
	//Show info
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+
				"\nStudent ID: "+studentID+
				"\nGrade  Level: "+gradeYear+
				"\nCourses Enrolled: "+courses+
				"\nTuition Balance: "+tuitionBalance;
	}
			
}

