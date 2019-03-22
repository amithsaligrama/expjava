import java.util.Scanner;
import java.io.*;
public class PygLatin {

	public static void main(String[] args) {
		String first = "a";
		String word = "b";
		String rest = "c";
		String pyg = "ay";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string to translate into pyglatin: ");
		word = in.nextLine();
		word = word.toLowerCase();
		first = word.substring(0,1);
		rest = word.substring(1);
		in.close();
		String newWord = rest + first + pyg;
		System.out.println("\nThis is your string ("+ word +") in pyglatin: " + newWord);
	}
}
