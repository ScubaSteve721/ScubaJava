package AAA;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lowest range: ");
		int x = Integer.valueOf(scanner.nextLine());
		System.out.println("Highest range: ");
		int y = Integer.valueOf(scanner.nextLine());
		System.out.println(findPrimes(x, y));
		scanner.close();
	}
	public static ArrayList<Integer> findPrimes(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int n = start; n < end; n++) {
		boolean prime = true;
		
		int i = 2;
		while(i <= n/2) {
			if(n % i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		if(prime) {
			primes.add(n);
			}
		}
		
		return primes;
	}
}