package AAA;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPM {
	
	static String[] words = {"lambaste", "ethereal", "shambles", "expiate", "haphazard", "flout",
							"auxiliary", "kismet", "genuflect", "megillah", "pedantic", "dragoon",
							"scurrilous", "flora", "allege", "tawdry", "blarney", "querulous",
							"hegemony", "emulate", "cacophony", "ulterior", "refurbish"};
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(words[rand.nextInt(9)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typedWords.length();
		int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
		
		System.out.println("WPM: " + wpm);
		
		scan.close();
	}
}