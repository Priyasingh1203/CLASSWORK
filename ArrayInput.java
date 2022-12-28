package oops;

import java.util.Scanner;

public class ArrayInput {
	private static Scanner sc;

	public static void main(String[] args) {
		int arr[]=new int[10]; //declaring and alloting memory for 10 inputs
		System.out.println("Enter the number of elements");
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) //for loop to take the inputs 
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();  //storing inputs taken from the user
		}
		for(int i=0;i<n;i++)  //to show all elements 
		{
			System.out.print("The elements are   " + arr[i]);
			
		}
	}

}
