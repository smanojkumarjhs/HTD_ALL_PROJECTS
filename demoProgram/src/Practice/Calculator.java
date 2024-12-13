package Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char ch=' ';
		do{
			
	    System.out.println("*****calculator******");
		
		System.out.println("menu : ");
		System.out.println("1.ADD");
		System.out.println("2.SUBTRACT");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVIDE");
		System.out.println("5.EXIT");
		System.out.println("ENTER YOUR CHOICE : ");
		int n= s.nextInt();
		switch(n) {
		
		case 1 :
		
		{	System.out.println("enter two numbers :");
			int a=s.nextInt();
			int b=s.nextInt();
			int res =a+b;
			System.out.println("the addition of given number is : "+res);
			System.out.println("do you want to continue : ");
		    ch=s.next().charAt(0);
			
			
		}break;
		
		case 2 :
			
		{	System.out.println("enter two numbers :");
			int a=s.nextInt();
			int b=s.nextInt();
			int res =a-b;
			System.out.println("the subtraction of given number is : "+res);
			System.out.println("do you want to continue : ");
		    ch=s.next().charAt(0);
			
			
		}break;
		
		case 3 :
		{
			System.out.println("enter two numbers :");
			int a=s.nextInt();
			int b=s.nextInt();
			int res =a*b;
			System.out.println("the multiplication of given number is : "+res);
			System.out.println("do you want to continue : ");
		    ch=s.next().charAt(0);
			
			
		}break;
		
		case 4 : 
		{
			System.out.println("enter two numbers :");
			int a=s.nextInt();
			int b=s.nextInt();
			if(a>b) 
			{
			int res =a/b;
			System.out.println("the division of given number is : "+res);
			System.out.println("do you want to continue : ");
		    ch=s.next().charAt(0);
			
		          }
			else
				System.out.println("invalid division..");
			System.out.println("do you want to continue : ");
		    ch=s.next().charAt(0);
			
			}
		
		default :
		{
			System.out.println("thank you ..");
		}
		}
		
	}while(ch=='y');
		
		


}
}