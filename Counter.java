package basicprogram;

public class Counter {
	//int count = 0;// instance variable (will get memory each when the instance variable is incremented)
	static int count =0;
	Counter()
	{
		count++; //incrementing variable
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Counter c1= new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();
        System.out.println(count);
	}

}
