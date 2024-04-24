package AAA;

import java.util.Scanner;

public class PANGRAM {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean pangram = true;
		int index = 0;
		
		String s = scan.nextLine();
		
		boolean[] mark = new boolean[26];
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				index = c - 'A';
			} else if(c >= 'a' && c <= 'z') {
				index = c - 'a';
			}
			
			mark[index] = true;
		
		}
		
		for(int i = 0; i < mark.length; i++) {
			if(mark[i] == false) {
				pangram = false;
			}
		}
		
		if(pangram == true) {
			System.out.println("PANGRAM");
		} else {
			System.out.println("NOOOO");
		}
		
		scan.close();
	}
}