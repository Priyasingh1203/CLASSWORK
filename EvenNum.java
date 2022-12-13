import java.util.Scanner;  
//importing Scanner class 

public class EvenNum
{
  public static void main(String[] args)
  {
      //variable declaration
      int i,n;
      //taking input from the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:"); //print the line 
      n = sc.nextInt();
      
      //using for loop 
      for(i=1; i<=n; i++)
      {
         if(i%2 == 0)
         {
            System.out.println(i+ "");
         }
      }
      
   }
}