import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

	public static void main(String[] args) {
		Random rand = new Random();
		int max = 100;
		int min = 1;
		int guesses = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("What is the maximum integer you want in the range? ");
		while (true) {
			try {
				max = Integer.parseInt(in.nextLine());
				break;
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("You gave me a bad value!");
				System.out.print("Try again. ");
			}
		}
		System.out.print("What is the minimum integer you want in the range? ");
		while (true) {
			try {
				min = Integer.parseInt(in.nextLine());
				if (min >= max) {
					System.out.println("The minimum should be less than the maximum.");
					System.out.print("Try again. ");
					continue;
				}
				break;
			}
			catch (Exception e) {
				System.out.println("You gave me a bad value!");
				System.out.print("Try again. ");
			}
		}
		int rand_int = rand.nextInt(max-min+1)+min;
		System.out.printf("Enter a number between %d and %d inclusive. ", min, max);
		while (true) {
			try {
				int user = Integer.parseInt(in.nextLine());
				if (user == rand_int) {
					break;
				}
				else if (user > max || user < min) {
					System.out.print("Please enter a number in the range. ");
				}
				else if (user > rand_int) {
					System.out.print("Lower, try again. ");
				}
				else if (user < rand_int) {
					System.out.print("Higher, try again. ");
				}
			guesses++;
			}
			catch (Exception e) {
				System.out.println("You gave me a bad value!");
				System.out.println("I won't count that as a guess.");
				System.out.print("Try again. ");
			}
		}
		int score = (max-min+1)/guesses;
		int poss = max-min+1;
		System.out.println("You found my number!!");
		System.out.printf("You took %d guess(es).\n", guesses);
		System.out.printf("You got a score of %d out of a possible %d.", score, poss);
		in.close();
	}
}
