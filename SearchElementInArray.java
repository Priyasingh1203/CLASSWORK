package oops;

import java.util.Scanner;

public class SearchElementInArray {
    private static Scanner sc;
    
	public static void main(String[] args) {
		int i,n,x,flag=0;
		int arr[]= new int[15];
		System.out.println("Enter the no. of elements:");
		sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("The array elements are: " );
		for(i=0; i<n;i++)
		{	
			arr[i]= sc.nextInt();
		}
		System.out.print("Enter the elements you want to search");
		x= sc.nextInt();
		for(i=0; i<n;i++)
		{
		if(arr[i]==x)
		{
			flag=1;
			break;
		}
		else 
		{
	     	flag=0;
		}
	    }
		if(flag == 1)
		{
			System.out.print("The number is found at" +(i));
		}
		else
		{
			System.out.print("The number is not found " );
		}	
	}
	
}


