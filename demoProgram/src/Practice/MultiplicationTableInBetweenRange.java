package Practice;

import java.util.Scanner;

public class MultiplicationTableInBetweenRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	System.out.println("enter the lower range : ");
	int l=s.nextInt();
	System.out.println("enter the upper range : ");
	int h= s.nextInt();
	System.out.println("multiplicaton table between the given range : ");
	for(int i=l;i<=h;i++) {
		System.out.println("the multiplication table of "+i);
		for(int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		System.out.println(" ");
	}

	}

}
