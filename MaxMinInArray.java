package oops;
import java.util.Scanner;

public class MaxMinInArray {
    static private Scanner sc;
	public static void main(String[] args) {
     int arr[]=new int[10];
	 int i,n,max,min;
       System.out.println("Enter the number of elements:");
       sc= new Scanner(System.in);
       n= sc.nextInt();
       System.out.println("The elements are:");
       for(i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt(); 
       }
       max = arr[0];
       min=arr[0];
       for(i=0;i<n;i++) 
       {  
    	   if( max >  arr[i])
    	   {
    		  max = arr[i];
    	   }
    	   if(min < arr[i])
    	   {
    		   min = arr[i];	   
    	   }
       }
       System.out.println("The maximum number is " +max + "  in the array");
       System.out.println("The minimum number is " +min + "  in the array"); 
       }
}


