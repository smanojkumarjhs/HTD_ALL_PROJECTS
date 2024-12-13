package Practice;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is largest..");
			} else {

				System.out.println(c + " is largest..");

			}
		} else {
			if (b > c) {

				System.out.println(b + " is largest..");
			}
		}
	}

}
