package oops;
import java.util.Scanner;
//interface with public and abtract methods
interface LibraryUser {
     void registerAccount(); //abstract method
     void requestBook();
}
//implementation class
class KidsUser implements LibraryUser{
    //concrete method 
	public void registerAccount() {
		
		System.out.println("You are allowed to register as you are a kid!!");
	}
    //concrete method 
	public void requestBook() {
		System.out.println("You can issue a book from kid section!!");
	}
	
}

class AdultUser implements LibraryUser{

	public void registerAccount() {
		System.out.println("You are allowed to register as you are an adult!!");
	}

	public void requestBook() {
		System.out.println("You can issue a  fictional book from adult section!!");
	}
}
//main class
public class InterfaceDemo2{
	private static Scanner sc;

	public static void main(String args[]) {
		String stg; //variable declaration
		sc = new Scanner(System.in);
		System.out.println("ENTER YOUR STAGE:");
		stg = sc.nextLine();
		
		KidsUser ku = new KidsUser(); //object creation of implementation class
		AdultUser au = new AdultUser();
		if(stg.equals("kid"))
		{
			ku.registerAccount(); //calling method of implementation class
			ku.requestBook();
		}
		else if(stg.equals("adult"))
		{
			au.registerAccount();
			au.requestBook();
		}
		else
		{
			System.out.println("SORRY!! WRONG INPUT:");
		}	
	}
}
