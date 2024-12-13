package Practice;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length : ");
		int l = s.nextInt();
		System.out.println("enter the breadth : ");
		int b = s.nextInt();
		int area =l*b;
		System.out.println("the area of rectangle is : "+area);
	

	}

}
