package AAA;

import java.util.Scanner;

public class WORDCOUNTER {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("TELL ME YOUR STORY");
		String content = scan.nextLine();
		scan.close();
		WORDCOUNTERContent myContent = new WORDCOUNTERContent(content);
		String word = "the";
		System.out.println(word + ": " +
				myContent.getCount(word));
		

	}

}
