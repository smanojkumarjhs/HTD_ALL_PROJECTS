package Practice;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n= s.nextInt();
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
			
		}
		System.out.println("the sum of digits are :"+sum);

	}

}
