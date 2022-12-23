package oopsprogram;
//interface 
interface Printable
{
	void display();
	void fun();
}
//implementing from interface 
class Print implements Printable
{

	@Override
	//overriding method
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printing is successful");
	}

	@Override
	//overriding method
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Printing is a kind of fun");
	}
	
}
//implementing from interface 
class Message implements Printable
{

	@Override
	//overriding method
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying msg is successful");
	}

	@Override
	//overriding method
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Messaging is a kind of fun");
	}
	
}
//main class
public class InterfaceDemo {
   public static void main(String[] args) {
	   Printable p=new Print(); //refering print class
	   p.display(); //calling display method 
	   p.fun();
	   Message msg= new Message();
	   msg.display();
	   msg.fun();
	   
   }
}
