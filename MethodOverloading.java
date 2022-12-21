package oops;

class Addition
{
	public void add(int a)
	{
		System.out.println("Addition value of one parameter: "+(a+10));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition value of three parameters: "+(a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("Addition of two parameter(int,double): "+(a+b));
		
	}
	public void add(double a,int b)
	{
		System.out.println("addition of parameter(double and int): "+(a+b));
	}
	
	}
//main class name
public class MethodOverloading {

	public static void main(String[] args) {
		Addition ad=new Addition();
		ad.add(12, 45, 10);
		ad.add(100);
		ad.add(12.3, 5);
		ad.add(56, 50.8);

	}

}