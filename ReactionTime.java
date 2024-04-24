package AAA;

import java.util.Scanner;

public class ReactionTime {
	
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("GO!");
		
		
		
		long startTime = System.currentTimeMillis();
		scan.nextLine();
		long stopTime = System.currentTimeMillis();
		
		
		long reactionTime = stopTime - startTime;
		
		System.out.println(reactionTime + "ms");
		
		
		scan.close();
	}
}
