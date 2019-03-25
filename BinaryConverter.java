import java.util.Scanner;
public class BinaryConverter {

	public static void main(String[] args) {
		int num = 10;
		String bin = "1010";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a base 10 integer to convert to binary: ");
		num = in.nextInt();
		bin = Integer.toBinaryString(num);
		in.close();
		System.out.println("\nThis is your integer ("+ num +") in binary: " + bin);
	}
}