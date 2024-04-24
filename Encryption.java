package AAA;

public class Encryption {
public static void main(String[] args) {
		//AAAAAAAA
		int key = 5;
		
		String text = "Xuthp%{futwnjx%wthp3%^tz%qtxj3";
		System.out.println(text);
		
		char[] chars = text.toCharArray();
		
		for(char c:chars) {
			c -= key;
			System.out.print(c);
		}
		
		
	}
}
