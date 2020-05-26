// Written by Alexander Baker on 5/20/2020
/*
 * program creates a pre-filled HashMap with student names(keys) 
 * and grades(values). main() reads in name of a student, outputing
 * original grade, and then reading
 */

import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String studentName;
		double studentGrade;
		
		HashMap<String, Double> studentGrades = new HashMap<String, Double>();
		
		// Students grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);
		
		//TODO: Read in new grade for a student, output initial
		//grade, replace with new grade in HashMap,
		//output new grade
		
		// read in new grade for student
		System.out.println("Enter name: ");
		studentName = scnr.nextLine();
		//System.out.println("Enter new grade: ");
		//studentGrade = scnr.nextDouble();
		
		if (studentGrades.containsKey(studentName)) {
			// output initial grade
			System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
			
			// read in new grade
			System.out.println("Enter new grade: ");
			studentGrade = scnr.nextDouble();
			
			// replace with new grade in HashMap
			studentGrades.replace(studentName, studentGrade);
			
			// output new grade
			System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));
		} else {
			System.out.println("Student is not in the HashMap!");
		}

	}

}
