package oopsprogram;
//we cannot create object 
interface Printable1 {
	void display();
	void fun();

}
interface Drawable extends Printable1
{
	void draw();
}
interface sayable
{
	void say();
}
class Print1 implements Drawable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying your message under Print1");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Have fun while learning under Print1");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw something under Print1");
	}
	
}
class Message1 implements Drawable,sayable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying under Message1");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("fun under Message1");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("try to speak under Message1");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw and code under Message1");
	}
	
}
public class InterfaceDemo1{
	public static void main(String args[])
	{
		Print1 p= new Print1();
		p.display();
		p.draw();
		p.fun();
		Message1 msg = new Message1();
		msg.display();
		msg.draw();
		msg.fun();
		msg.say();
	}
}
