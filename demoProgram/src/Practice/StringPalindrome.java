package Practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the string : ");
		String name = s.next();
		String copy=name;
		String res=" ";
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			res=res+ch;
					
		}
		if(copy.equals(name))
		
		{
			System.out.println(name+" is palindrome..");
		}else {
			System.out.println(name+" is not palindrome ..");
		}
		
	}

}
