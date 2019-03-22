import java.util.Scanner;

public class LetterReplacer {

	public static void main(String[] args) {
		String str = "";
		String n = "a";
		String m = "b";
		String replaced = "c";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a message: ");
		str = in.nextLine();
		System.out.print("What is a sequence of characters you want to remove from your message (leave blank if you do not want to remove any characters)? ");
		n = in.nextLine();
		System.out.print("What do you want to replace that with (leave blank if you do not want to replace that string)? ");
		m = in.nextLine();
		replaced = str.replace(n, m);
		in.close();
		System.out.println("Here is your encrypted message: " + replaced);
	}

}
