package Practice;

import java.util.Scanner;

public class VoterEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the age : ");
		int age =s.nextInt();
		if(age>18) {
			if(age<100) {
				System.out.println("the voter is eligible.......");
			}else {
				System.out.println("the age limit is greater than eligibility...");
			}
		}
		else {
			System.out.println("the age limit is below than the eligibility....");
		}

	}

}
