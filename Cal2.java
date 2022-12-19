package calculation;
public class Cal2{
	public void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of a number is" +fact);
	}
}
