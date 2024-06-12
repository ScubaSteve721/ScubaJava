package AAA;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("ENTER A PALINDROME: ");
		String original = scanner.nextLine();
		original = original.replace(" ","");
		scanner.close();
		
		
		
		String reverse = "";
		
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("THAT'S A PALINDROME!");
		} else {
			System.out.println("NOT EVEN A PALINDRORME!");
		}
	}
}

