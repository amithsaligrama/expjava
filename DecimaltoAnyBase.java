import java.util.Scanner;

public class DecimaltoAnyBase {
	public static void main(String[] args) {
		int radix = 2;
		int num = 10;
		String result = "1010";
		Scanner in = new Scanner(System.in);
		System.out.print("What base do you want your result to be in? ");
		while (true) {
			try {
				radix = Integer.parseInt(in.nextLine());
				break;
			}
			catch (Exception e) {
				System.out.println("You gave me a bad value!");
				System.out.print("Try again. ");
			}
		}
		System.out.printf("Enter a base 10 integer to convert into base %d. ", radix);
		while (true) {
			try {
				num = Integer.parseInt(in.nextLine());
				result = Integer.toString(num,radix);
				break;
			}
			catch (Exception e) {
				System.out.println("You gave me a bad value!");
				System.out.print("Try again. ");
			}
		}
		in.close();
		System.out.println(num + " in base 10 is " + result.toUpperCase() + " in base " + radix + ".");
	}
}
