package Practice;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of coin flips : ");
		int n=s.nextInt();
		s.close();
		Random random = new Random();
		int heads=0;
		int trails=0;
		for(int i=0;i<n;i++) {
			boolean isHead=random.nextBoolean();
			if(isHead) {
				heads++;
				System.out.println("Heads");
			}
			else {
				trails++;
				System.out.println("Trails");
			}
		}
		System.out.println("Heads : "+heads);
		System.out.println("Heads : "+trails);
	}

}
