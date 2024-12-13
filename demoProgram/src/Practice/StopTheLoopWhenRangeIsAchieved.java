package Practice;

import java.util.Scanner;

public class StopTheLoopWhenRangeIsAchieved {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the target number : ");
		int target = s.nextInt();
		int count = 0;
		while (target != 0) {
			System.out.println(count++);

			if (count == target) {
				break;

			}

		}

	}
}
