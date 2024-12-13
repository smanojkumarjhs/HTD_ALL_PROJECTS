package Practice;

import java.util.Scanner;

public class SumOfArrayElementsForEach {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("enter the array size : ");
		int size=s.nextInt();
		int arr []=new int[size];
		System.out.println("enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("the entered array is : "+arr);
		int sum=0;
		for(int n:arr) {
			sum=sum+n;
		}
		System.out.println("the sum of array elements are : "+sum);
		

	}

}
