package AAA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalPoints = 0;
		int totalCredits = 0;
		int points = 0;
		int gradeValue = 0;
		String grade = "";
		int credits = 0;
		
		boolean moreClasses = false;
		
	do {
	
			
			boolean validCredits = true;
		do {
			validCredits = true;
			
			System.out.println("ENTER CREDITS: ");
			String creditString = scan.nextLine();
			
			
			try {
				credits = Integer.parseInt(creditString);
			}
			catch (NumberFormatException nfe) {
				System.out.println("ENTER VALID INTEGER");
			}
		}
			while (!validCredits);
		
			boolean validGrade = true;
			
			
			
			
		do {
			validGrade = true;
			
			System.out.println("ENTER GRADE: ");
			grade = scan.nextLine();
			
			if (grade.equalsIgnoreCase("A")) {
				gradeValue = 4;
			} else if (grade.equalsIgnoreCase("B")) {
				gradeValue = 3;
			} else if (grade.equalsIgnoreCase("C")) {
				gradeValue = 2;
			} else if (grade.equalsIgnoreCase("D")) {
				gradeValue = 1;
			} else if (grade.equalsIgnoreCase("F")) {
				gradeValue = 0;
			} else {
				System.out.println("INVALID GRADE");
				validGrade = false;
			}
		}
	while (!validGrade);
		
		points = gradeValue * credits;
		totalPoints += points;
		totalCredits += credits;
		
		System.out.println("ENTER ANOTHER CLASS? (Y/N)");
		String moreClassesString = scan.nextLine();
		
		moreClasses = moreClassesString.equalsIgnoreCase("Y");
	
	}
	while (moreClasses);
	
		DecimalFormat df = new DecimalFormat("0.00");
		Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
		
		System.out.println("Credits: " + credits);
		System.out.println("Grade: " + grade);
		System.out.println("Points: " + points);
		System.out.println("GPA: " + df.format(gpa));
		
		scan.close();
	}

}
