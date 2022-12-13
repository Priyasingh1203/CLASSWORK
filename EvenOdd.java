import java.util.Scanner; //import Scanner class

public class EvenOdd
{
  public static void main(String[] args)
  {
      int n; //variable declaration
      Scanner sc = new Scanner(System.in); //take input from the user
      System.out.println("Enter a number:");
      n = sc.nextInt();
     
      if(n%2 == 0)
      {
         System.out.println("Number is even"); //print the output
      }
      else 
      {
         System.out.println("Number is odd");
      }
   }
}