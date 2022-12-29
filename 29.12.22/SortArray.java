package arrayprogram;
import java.util.Scanner;
public class SortArray {
	   private static Scanner sc;

	public static void sort(int arr[],int n)//sort array method
	   {
		   
		   int i,j,temp; //declaring variables and temp for storing temporary value
		   for(i=0;i<n-1;i++) //outer loop for first index number
		   {
			   for(j=i+1;j<n;j++) //inner loop for second index number
			   {
				   if(arr[i]>arr[j]) 
				   {
					   temp= arr[j];
					   arr[j]=arr[i];
					   arr[i]=temp;
				   }
				  
			   }
		   }
		   for(i=0;i<n;i++) //showing all sorted array 
		   {
			   System.out.println(arr[i] +" ");
		   }
	   }
	
       public static void main(String[] args)
       {
    	  sc = new Scanner(System.in);  
    	  int arr[]= new int[10];
    	  int i,n;
    	  
    	  System.out.println("Enter the number of elements:");
    	  n=sc.nextInt();
    	  System.out.println("The elements are:");
    	  for(i=0;i<n;i++)
    	  {
    		  arr[i]= sc.nextInt();  //storing value of array
    	  }
    	  System.out.println("Array after sorting");
    	  SortArray.sort(arr, n); //calling sort method
       }
}
