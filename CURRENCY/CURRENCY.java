package AAA;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CURRENCY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();
		
		String us = (NumberFormat.getCurrencyInstance(Locale.US).format(payment));
		String india = (NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
		String china = (NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		String france = (NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
		
		System.out.println("US" + " " + us);
		System.out.println("INDIA" + " " + india);
		System.out.println("CHINA" + " " + china);
		System.out.println("FRANCE" + " " + france);

	}

}
