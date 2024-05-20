package AAA;

import java.util.Random;
import java.util.Scanner;

public class GAMEOFthreedice {
	
	public static void main(String[] args) {
	
		int numDice = 3, trials	= 5;
		int playerPoints = 0, computerPoints = 0;
		Random choice = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CHOOSE A NUMBER (1-6)");
		
		int playerTarget = scan.nextInt();
		Game1 player = new Game1(numDice, trials);
		playerPoints = player.play("Player", playerTarget);
		int computerTarget = choice.nextInt(6) + 1; 
		
		System.out.println("I HAVE CHOSEN " + computerTarget);
		Game1 computer = new Game1(numDice, trials);
		computerPoints = computer.play("Computer", computerTarget);
		
		if(playerPoints > computerPoints) {
			System.out.println("YOU HAVE WON");
		}
		else if(playerPoints < computerPoints) {
			System.out.println("I HAVE WON");
		}
		else System.out.println("DRAW");
		
		scan.close();
		
	}
}
