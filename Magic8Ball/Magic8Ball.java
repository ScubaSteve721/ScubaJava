package AAA;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
	public static void main(String[] args) {
		Scanner scanner	 = new Scanner(System.in);
		
		System.out.println("ENTER YOUR QUERY: ");
		scanner.next();
		scanner.close();
		
		Random rand = new Random();
		int r = rand.nextInt(18);
		
		if(r == 0) {
			System.out.println("It is decidedly so");
		}else if(r == 1) {
			System.out.println("Without a doubt");
		}else if(r == 2) {
			System.out.println("Yes definitely");
		}else if(r == 3) {
			System.out.println("As I see it, yes");
		}else if(r == 4) {
			System.out.println("You may rely on it");
		}else if(r == 5) {
			System.out.println("Signs point to yes");
		}else if(r == 6) {
			System.out.println("Reply hazy, try again");
		}else if(r == 7) {
			System.out.println("Ask again later");
		}else if(r == 8) {
			System.out.println("Better not tell you now");
		}else if(r == 9) {
			System.out.println("Cannot predict now");
		}else if(r == 10) {
			System.out.println("Concentrate and ask again");
		}else if(r == 11) {
			System.out.println("Don’t count on it");
		}else if(r == 12) {
			System.out.println("My reply is no");
		}else if(r == 13) {
			System.out.println("My sources say no");
		}else if(r == 14) {
			System.out.println("Outlook not so good");
		}else if(r == 15) {
			System.out.println("Very doubtful");
		}else if(r == 16) {
			System.out.println("THAT WAS FAR TOO LONG, YOU SHALL PERISH.");
		}else if(r == 17) {
			System.out.println("Spock smashes scissors. You lose.");
		}
	
		
	}
}