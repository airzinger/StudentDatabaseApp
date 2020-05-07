package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many students we want to add in database
		System.out.print("Enter the number of students you want to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] stu = new Student[numOfStudents];
		
		// Create n number of new students
		for(int i=0;i<numOfStudents;i++) {
			stu[i] = new Student();
			stu[i].enroll();
			stu[i].payTuition();
		}
		
		for(int i=0;i<numOfStudents;i++) {
			System.out.println(stu[i].showInfo());
		}
		
	}

}
