import java.util.Scanner;

public class NRemover {
	public static void main(String[] args) {
		String str = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a message: ");
		str = in.nextLine();
		String strNew = str.replace("n", "");
		String removed = strNew.replace("N", "");
		in.close();
		System.out.println("\nThis is how you would have to say or write this message in China: " + removed);
	}
}