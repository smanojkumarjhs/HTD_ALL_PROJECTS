package Practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the lower range : ");
		int l = s.nextInt();
		System.out.println("enter the higher range : ");
		int h = s.nextInt();
		System.out.println("the armstrong number between the "+l+" and "+h+" ranges are ");
		for (int i = l; i <= h; i++) {
			if(isArmstrong(i)) {
				System.out.println(i+" ");
			}
		}
	}
	public static boolean isArmstrong(int num) {
		int sum=0;
		int original =num;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
			
		}
		return sum ==original;
		
	}

}
