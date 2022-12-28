package oops;

import java.util.Scanner;

public class EvenOddArr {

	private static Scanner sc;

	public static void main(String[] args) {
		int i,even_count=0,odd_count=0;
		int arr[]= new int[12];
		System.out.print("Enter the number of elements you want to print:  ");
		sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print("The array elements are: " );
		for(i=0; i<n;i++)
		{	
			arr[i]= sc.nextInt();
		}
		for(i=0; i<n;i++)
		{
		if(arr[i]%2 == 0)
		{
		   even_count++;
		}
		else 
		{
		   odd_count++;		
		}
		}
		System.out.println("The number of even numbers:" +even_count);
		System.out.println("The number of odd numbers:" +odd_count);
		
	}
			
}

