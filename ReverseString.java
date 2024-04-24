package AAA;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER: ");
		String input = scanner.nextLine();
		
		String r = reverse(input);
		System.out.println(r);
		scanner.close();
		
	}
	
		public static String reverse(String s) {
			char[] letters = new char[s.length()];
			
			int letterIndex = 0;
			for(int i = s.length() - 1; i >= 0; i--) {
				letters[letterIndex] = (s.charAt(i));
				letterIndex++;
				
			}
			
			String reverse = "";
			for(int i = 0; i < s.length(); i++) {
				reverse = reverse + letters[i];
			}
			
			return reverse;
		
		
	}
}