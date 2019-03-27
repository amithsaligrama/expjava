import java.util.Scanner;
public class GCFofTwo {

	public static void main(String[] args) {
		int a = 96;
		int b = 108;
		String input = "4 5";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 integers, and separate them by a space. ");
		while (true) {
			try {
				input = in.nextLine();
				String[] str = input.split(" ");
				if (str.length > 2) {
					System.out.println("You gave too many integers! I only asked for 2.");
					System.out.print("Try again. ");
					continue;
				}
				a = Integer.parseInt(str[0]);
				b = Integer.parseInt(str[1]);
				while (true) {
					if (a == 0 || b == 0 || a == b) {
						if (a > b) {
							b = a;
						}
						else if (a < b) {
							a = b;
						}
						break;
					}
					else if (a > b) a = a % b;
					else  b = b % a;
				}
			}
			catch (Exception e) {
				System.out.println("You gave me a bad value!");
				System.out.print("Try again, and remember, separate them by a space. ");
				continue;
			}
			break;
		}
		in.close();
		System.out.println("The GCF is " + b + ".");
	}

}