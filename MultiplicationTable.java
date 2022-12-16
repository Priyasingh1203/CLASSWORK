package basicprogram;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i,num,product;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table number: ");
		num = sc.nextInt();
		for(i=1;i<=10;i++)
		{	
		  product = num * i;
		  System.out.println(+num + "*" +i+ "=" +product);
		}
	}

}
