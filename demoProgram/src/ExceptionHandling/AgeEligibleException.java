package ExceptionHandling;

import java.util.Scanner;

public class AgeEligibleException {
	public static int age;

	static void eligibility() throws NotEligibleException {
		if (age >= 18) {
			System.out.println("Eligible to vote");
		}

		else {
			throw new NotEligibleException("Invalid age");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		try {
			eligibility();
		} catch (NotEligibleException e) {
			System.out.println(e.getMsg());
		}
	}

	public static class NotEligibleException extends Exception {
		String msg;

		public NotEligibleException(String msg) {
			this.msg = msg;
		}

		public String getMsg() {
			return msg;
		}
	}

}
