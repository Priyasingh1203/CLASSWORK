
package arrayprogram;
import java.util.*;

public class SearchNumber {
	  public static void main(String args[])
	  {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter elements:");
		  //int n=sc.nextInt();
		  int arr[]=new int[5];
		  for(int i=0; i<arr.length; i++)
		  {
			 arr[i]=sc.nextInt();
		  }
		  System.out.println("Enter X");
		  int x= sc.nextInt();
		  int i=0;
		  if(arr[i]== x)
		  {
    		  System.out.println("The Number  " +x +"  found at " +i);
		  }
		  else
		  {
			  System.out.println("data is not present");
		  }
	  }
      
      
}
