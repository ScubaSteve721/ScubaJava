package AAA;

import java.util.Scanner;

public class MultipleChoice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] answers = {"",""};
		String[] solutions = {"D","B"};
		
		
		
		System.out.println("A car averages 27 miles per gallon. If gas costs $4.04 per gallon, which of the following"); 
		System.out.println("is closest to how much the gas would cost for this car to travel 2,727 typical miles?");
		System.out.println("A) $44.44");
		System.out.println("B) $109.08");
		System.out.println("C) $118.80");
		System.out.println("D) $408.04");
		System.out.println("E) $444.40");
		
		System.out.println("");
		
		System.out.println("If x = 3 and y = 5, by how much does the value of 3x^2 – 2y exceed the value of 2x^2 – 3y?");
		System.out.println("A) 4");
		System.out.println("B) 14");
		System.out.println("C) 16");
		System.out.println("D) 20");
		System.out.println("E) 50");
				
		answers[0] = scan.next();
		answers[1] = scan.next();
		
		int score = 0;
		
		for(int i = 0; i < 2; i++) {
			if(answers[i].equalsIgnoreCase(solutions[i])) {
				score++;
			}
		}
		
		System.out.println("Score: " + score + "/2");
		
		scan.close();
	}
}