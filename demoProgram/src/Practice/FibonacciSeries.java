package Practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the target : ");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c,count=0;
		while(count<n){
			c=a+b;
			System.out.println("the fibonacci series is : "+c);
			a=b;
			b=c;
		count++;
		}
		System.out.println();
		
		

	}

}
