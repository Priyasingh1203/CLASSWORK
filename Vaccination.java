package oops;

import java.util.Scanner;

//an abstract class 
abstract class Vaccine{
	int a;
	String n,s,q;
	//an abstract method
	abstract public void boosterDose();
	//concrete method
	public void firstDose() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Nationality:");
	    n= sc.nextLine();
	    System.out.println("Enter Your Age:");
	    a= sc.nextInt();
	    if(a>=18 && n.equals("Indian"))
	    {
	    	System.out.println("You are eligible to take first dose");
	    }
	    else
	    {
	    	System.out.println("You are not eligible");
	    }
	}
	//concrete method
    public void secondDose() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Have you completed your first dose:");
    	q = sc.nextLine();
    	if(q.equals("Yes"))
    	{
    		System.out.println("You have completed your first dose");
    		System.out.println("Kindly,Pay Rs.250");
    		
    	}
    	else
    	{
    		System.out.println("Please take first dose");
    	}
	}
}
class VaccinationSuccessful extends Vaccine{

	@Override
	public void boosterDose() {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Have you completed your second dose:");
    	s = sc.nextLine();
		if(s.equals("Yes"))
    	{
    		System.out.println("You are successfully vaccinated");
    	}
    	else
    	{
    		System.out.println("Sorry! Complete your vaccination process");
    	}
		
	}
	
}
//main class
public class Vaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vaccine vc= new VaccinationSuccessful();		
		vc.firstDose();
		vc.secondDose();
		vc.boosterDose();
	}

}
