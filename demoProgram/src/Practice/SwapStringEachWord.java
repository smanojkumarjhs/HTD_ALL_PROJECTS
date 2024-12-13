package Practice;

import java.util.Scanner;

public class SwapStringEachWord {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string : ");
		String name = s.nextLine(); // "i am an automation engineer"
		String[] s1 = name.split(" ");

		for (int i = 0; i < s1.length; i++) {
			String word = s1[i];
			String rev = " ";
			for (int j = word.length() - 1; j >= 0; j--) {
				char ch = word.charAt(j);
				rev = rev + ch;
			}
			System.out.print(rev + "");
		}

	}

}
