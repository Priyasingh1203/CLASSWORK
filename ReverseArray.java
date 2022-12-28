package oops;
import java.util.Scanner;
public class ReverseArray {
    static private Scanner sc;
	public static void main(String[] args) {
	    int arr[]=new int[10];
	    int i,n;
	    System.out.println("Enter the number of elements:");
	    sc=new Scanner(System.in);
	    n=sc.nextInt();
	    System.out.println("The elements of an array:");
	    for(i=0;i<n;i++)
	    {
	    	arr[i]= sc.nextInt();
	    }
	    System.out.println("The elements after reversing array :");
	    for(i=n-1;i>=0;i--)
	    {
	    	System.out.println(arr[i]);
	    	
	    }

	}

}
