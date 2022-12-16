package basicprogram;
import java.util.Scanner;
public class Cubes {

	public static void main(String[] args) {
	   int num,cube;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a Number:");
	   num=sc.nextInt();
	   for(int i=1; i<=num; i++)
	   {
		   cube= i*i*i;
	   System.out.println("The cube of: " +i +" "+ "is " +cube);
	   }

	}

}
