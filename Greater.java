import java.util.Scanner;

public class Greater
{
  public static void main(String[] args)
  {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a:");
      a = sc.nextInt();
      System.out.println("Enter the value of b:");
      b = sc.nextInt();
      System.out.println("Enter the value of c:");
      c = sc.nextInt();
     
      if(a>b && a>c)
      {
         System.out.println("a is greater");
      }
      else if(b>a && b>c)
      {
         System.out.println("b is greater");
      }
      else 
      {
         System.out.println("c is greater");
      }
   }
}