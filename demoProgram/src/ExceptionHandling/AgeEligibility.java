package ExceptionHandling;

import java.util.Scanner;

public class AgeEligibility {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the age : ");
		int age = s.nextInt();
		try {
			if (age >= 18) {
				System.out.println("you are eligible......");
			} else {
				throw new NullPointerException("you are not eleigible...");
			}

		} catch (Exception e) {
			System.out.println("exception handled...");
		}

	}
}
