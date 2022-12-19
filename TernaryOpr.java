package basicprogram;

import java.util.Scanner;

public class TernaryOpr {

	public static void main(String[] args) {
	  int num1,num2,max;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of num1:");
	  num1 = sc.nextInt();
	  System.out.println("Enter the value of num2:");
	  num2 = sc.nextInt();
      max=(num1>num2)?num1:num2;
      System.out.println("max number:" +max);
	}

}
