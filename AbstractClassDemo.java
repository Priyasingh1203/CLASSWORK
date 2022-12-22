package oops;
abstract class Bank1{
	//abstract method with no body
	abstract public void getLoan();
	//concrete method has body
	public void display()
	{
		System.out.println("I m a bank class.");
	}
}
class Sbi1 extends Bank1{

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		System.out.println("provides 6.9% interest");
	}
	
}
class Axis1 extends Bank1{

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		System.out.println("provides 10% interest");
	}
	
}
public class AbstractClassDemo{
	public static void main(String args[]) {
		Bank1 bk= new Sbi1();
		bk.getLoan();
		bk.display();
		bk= new Axis1();
		bk.getLoan();
		bk.display();
	}
}