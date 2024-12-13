package ExceptionHandling;

import java.util.Scanner;

public class ToHandleArithmaticException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int res;
		try {
			res = a / b;
		} catch (Exception e) {
			System.out.println("handle the exception");
		}
		s.close();
	}

}
