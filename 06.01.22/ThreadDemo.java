package thread;

public class ThreadDemo extends Thread {                                                                      //ThreadDemo Inheriting Thread class 
  public ThreadDemo(String name)                                                                              //concrete method
  {
	  super(name);
  }
	public void run()                                                                                           //concrete method
	{
		System.out.println("Thread is running:" +Thread.currentThread().getName());                               //pre-defined method currentThread and getName
	}
	public static void main(String[] args) {
		
        ThreadDemo t1=new ThreadDemo("1st thread");                                                           //object t1 created for class ThreadDemo
        ThreadDemo t2=new ThreadDemo("2nd thread");                                                           //object t2 created for class ThreadDemo
        ThreadDemo t3=new ThreadDemo("3rd thread");                                                           //object t3 created for class ThreadDemo
        t1.start();                                                                                           //calling pre-defined method start.
        t2.start();
        t3.start();
        
	}

}
