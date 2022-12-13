import java.util.Scanner; //import scanner class

public class Factorial
{
  public static void main(String[] args)
  {
      int i,fact=1,n; //intialization
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      n = sc.nextInt();
     
      for(i=1; i<= n; i++)
      {
        fact = fact*i;
      }
      System.out.println("factorial is " +fact);
    
   }
}