package Practice;

import java.util.Scanner;

public class SkippingEvenNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("enter the range : ");
		int range=s.nextInt();
		for(int i=0;i<=range;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}

	}

}
