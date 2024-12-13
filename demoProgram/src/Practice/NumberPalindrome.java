package Practice;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=s.nextInt();
		int copy=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
				}
		if(copy==rev) {
			System.out.println("it is palindrome..");
		}else {
			System.out.println("it is not palindrome..");
		}
	}

}
