package Practice;

import java.util.Random;

public class GenerateRandomSixDigitNumber {

	public static void main(String[] args) {
		Random r = new Random();
		int num=r.nextInt(1000000);
		System.out.println(num);
	}

}
