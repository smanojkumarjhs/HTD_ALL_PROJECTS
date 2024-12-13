package Practice;

import java.util.Scanner;

public class PrimeNumbersBetweenTheRange {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the lower range : ");
		int l=s.nextInt();
		System.out.println("enter the higher range : ");
		int h=s.nextInt();
		System.out.println("the prime numbers between the given range are : ");
		for(int i=l;i<h;i++){
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
